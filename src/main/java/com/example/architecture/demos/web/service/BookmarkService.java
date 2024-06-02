package com.example.architecture.demos.web.service;

import com.example.architecture.demos.web.entity.Policy;
import com.example.architecture.demos.web.mapper.BookmarkDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookmarkService {
    @Autowired
    private BookmarkDao bookmarkDao;

    public List<Policy> getPoliciesByUsername(String username) {
        List<Policy> policies = bookmarkDao.getPoliciesByUsername(username);

        // 加上自增的id
        long counter = 1;
        for(Policy policy : policies) {
            policy.setId(counter++);
        }

        return policies;
    }
}
