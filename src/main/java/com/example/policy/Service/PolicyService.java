package com.example.policy.Service;

import com.example.policy.entity.Policy;
import com.example.policy.repository.BookmarkRepository;
import com.example.policy.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private BookmarkRepository bookmarkRepository;

    public PolicyResponse getPolicyById(Long id, String userName) {
        Optional<Policy> policyOpt = policyRepository.findById(id);
        if (policyOpt.isPresent()) {
            Policy policy = policyOpt.get();
            boolean bookmarked = bookmarkRepository.existsByUserNameAndPolicyId(userName, id);
            return new PolicyResponse(policy.getTitle(), policy.getHtml(), policy.getContent(),policy.getPubDate(),
                    policy.getNumber(), policy.getSourceUrl(), policy.getFileUrl(), bookmarked ? 1 : 0);
        } else {
            return null;
        }
    }
}