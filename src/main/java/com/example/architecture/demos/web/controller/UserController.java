package com.example.architecture.demos.web.controller;

import com.example.architecture.demos.web.dto.*;
import com.example.architecture.demos.web.entity.*;
import com.example.architecture.demos.web.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    UserInfoService userInfoSercvice;
    @Autowired
    BookmarkService bookmarkService;
    @Autowired
    SubscribeService subscribeService;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    UpdateSubService updateSubService;


    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public LoginResponse login(String username, String password){
        try {
            userService.checkLogin(username,password);
            System.out.println("密码正确");
            return new LoginResponse(200, "请求成功");
        } catch (Exception e) {
            System.out.println("密码错误");
            return new LoginResponse(201, "请求失败");
        }
    }

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    @GetMapping(value = "/info/{username}")
    public UserInfoResponse info(@PathVariable(value = "username")String username) {
        UserInfo userInfo = userInfoSercvice.getUserInfoByUsername(username);
        if(userInfo != null) {
            return new UserInfoResponse(200,userInfo,"请求成功");
        }
        return new UserInfoResponse(201,null,"请求失败");
    }

    /**
     * 查询收藏
     * @param username
     * @return
     */
    @GetMapping(value = "/collection/{username}")
    public CollectionResponse collection(@PathVariable(value = "username")String username) {
        List<Policy> policies = bookmarkService.getPoliciesByUsername(username);
        if (policies != null) {
            List<PolicyJSON> policiesJSON = new ArrayList<>();
            for (Policy policy : policies) {
                PolicyJSON policyJSON = new PolicyJSON();
                // 将从数据库中获得的数据修改成合适的JSON格式数据
                policyJSON.setId(policy.getId());
                policyJSON.setPolicy_id(policy.getPolicy_id());
                policyJSON.setTitle(policy.getTitle());
                policyJSON.setSource(policy.getSource());
                policyJSON.setSourceurl(policy.getSourceurl());
                policyJSON.setPubDate(policy.getPubDate());
                policyJSON.setNumber(policy.getNumber());
                policyJSON.setLevel(policy.getLevel());
                policyJSON.setContent(policy.getContent());
                policyJSON.setFileurl(policy.getFileurl());
                policiesJSON.add(policyJSON);
            }
            return new CollectionResponse(200, new PolicyCollection(policiesJSON), "请求成功");
        }
        return new CollectionResponse(201,null,"请求失败");
    }

    @GetMapping(value = "/subscribe/get/{username}")
    public GetSubscribeResponse getSubscribe(@PathVariable(value = "username")String username) {
        String sub = redisTemplate.opsForValue().get(username);
        if(sub != null) {
            System.out.println("在Redis找到数据");
            return new GetSubscribeResponse(200, new SubscribeJSON(sub), "请求成功");
        } else {
            System.out.println("未在Redis找到数据");
            sub = subscribeService.getSubscribeByUsername(username);
            if(sub != null) {
                System.out.println("在MySQL找到数据");
                redisTemplate.opsForValue().set(username, sub);
                System.out.println("将数据写入Redis");
                return new GetSubscribeResponse(200, new SubscribeJSON(sub), "请求成功");
            } else {
                System.out.println("未在MySQL找到数据");
                return new GetSubscribeResponse(201, null, "请求失败");
            }
        }
    }

    @PostMapping(value = "/subscribe/update")
    public UpdateSubResponse updateSubscribe(String username, String sub) {
        try {
            redisTemplate.opsForValue().set(username, sub);
            updateSubService.updateSubByUsername(username, sub);
            return new UpdateSubResponse(200, "订阅成功");
        } catch (Exception e) {
            return new UpdateSubResponse(201, "订阅失败");
        }

    }
}
