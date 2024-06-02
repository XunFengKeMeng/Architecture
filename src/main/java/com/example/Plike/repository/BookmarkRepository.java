package com.example.Plike.repository;

import com.example.Plike.model.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    List<Bookmark> findByPolicyIdAndUserName(Long policyId, String userName);
}
