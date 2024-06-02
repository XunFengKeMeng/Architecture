package com.example.architecture.demos.web.mapper;

import com.example.architecture.demos.web.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 根据username查询用户部分信息
 */
@Mapper
public interface UserInfoDao {
    UserInfo getUserInfoByUsername(String username);
}
