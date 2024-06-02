package com.example.architecture.demos.web.service;

import com.example.architecture.demos.web.entity.UserInfo;
import com.example.architecture.demos.web.mapper.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    public UserInfo getUserInfoByUsername(String username) {
        return userInfoDao.getUserInfoByUsername(username);
    }
}
