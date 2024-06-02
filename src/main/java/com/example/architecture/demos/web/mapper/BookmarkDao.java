package com.example.architecture.demos.web.mapper;

import com.example.architecture.demos.web.entity.Policy;
import com.example.architecture.demos.web.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 根据username查询用户收藏的政策id列表
 */
@Mapper
public interface BookmarkDao {
    @Select("SELECT p.id AS id,p.id AS policy_id,p.title AS title,p.source AS source,p.sourceurl AS sourceurl,p.fileurl AS fileurl,p.pubdate AS pubDate,p.number AS number,p.level AS level,p.content AS content FROM policy p " +
            "INNER JOIN bookmark b ON p.id = b.policy_id " +
            "WHERE b.user_name = #{username}")
    List<Policy> getPoliciesByUsername(@Param("username") String username);
}
