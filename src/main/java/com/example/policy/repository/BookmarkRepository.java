package com.example.policy.repository;

import com.example.policy.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    boolean existsByUserNameAndPolicyId(String userName, Long policyId);
}
