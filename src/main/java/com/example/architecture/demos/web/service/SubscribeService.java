package com.example.architecture.demos.web.service;

import com.example.architecture.demos.web.mapper.SubscribeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscribeService {
    @Autowired
    private SubscribeDao subscribeDao;

    public String getSubscribeByUsername(String username) {
        return subscribeDao.getSubsByUsername(username);
    }

}
