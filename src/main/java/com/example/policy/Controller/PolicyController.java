package com.example.policy.Controller;

import com.example.policy.Service.PolicyResponse;
import com.example.policy.Service.PolicyService;
import com.example.policy.dto.PolicyResponse1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @PostMapping("/{id}")
    public PolicyResponse1 getPolicyById(@PathVariable Long id) {
        PolicyResponse data = policyService.getPolicyById(id, "xuee");
        if (data != null) {
            PolicyResponse1 response = new PolicyResponse1(200,"请求成功", data);
            return response;
        } else {
            PolicyResponse1 response = new PolicyResponse1(201,"请求失败", null);
            return response;
        }
    }
}
