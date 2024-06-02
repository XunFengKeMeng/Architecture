package com.example.architecture.demos.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UpdateSubDao {

    @Update("UPDATE user SET User_sub = #{sub} WHERE User_name = #{username}")
    void updateSubByUsername(@Param("username") String username, @Param("sub") String sub);
    String updateSubByUsername(String username);
}
