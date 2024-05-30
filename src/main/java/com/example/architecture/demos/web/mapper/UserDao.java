package com.example.architecture.demos.web.mapper;

import com.example.architecture.demos.web.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 根据username查询用户信息
 */
@Mapper
public interface UserDao {
    User getUserByUsername(String username);
}
