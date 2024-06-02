package com.example.architecture.demos.web.mapper;

import com.example.architecture.demos.web.entity.Subscribe;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 根据username获取收藏信息
 */
@Mapper
public interface SubscribeDao {
    @Select("SELECT User_sub AS sub FROM user " +
            "WHERE User_name = #{username}")
    String getSubsByUsername(String username);
}
