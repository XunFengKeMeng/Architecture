package com.example.architecture.demos.web.service;

import com.example.architecture.demos.web.mapper.UpdateSubDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateSubService {
    @Autowired
    private UpdateSubDao updateSubDao;

    public void updateSubByUsername(String username, String sub) {
        updateSubDao.updateSubByUsername(username, sub);
    }

}
