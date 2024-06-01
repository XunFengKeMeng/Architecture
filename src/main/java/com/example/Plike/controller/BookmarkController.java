package com.example.Plike.controller;

import com.example.Plike.model.Bookmark;
import com.example.Plike.repository.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BookmarkController {

    @Autowired
    private BookmarkRepository bookmarkRepository;

    @PostMapping("/add_policy")
    public ResponseEntity<Map<String, Object>> addPolicy(@RequestBody Map<String, Long> payload) {
        Long policyId = payload.get("policyId");
        if (policyId == null) {
            Map<String, Object> response = new HashMap<>();
            response.put("code", 400);
            response.put("msg", "policyId is required");
            return ResponseEntity.badRequest().body(response);
        }
        Bookmark bookmark = new Bookmark();
        bookmark.setPolicyId(policyId);
        bookmark.setUserName("xuee");
        bookmarkRepository.save(bookmark);

        Map<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("msg", "Policy added successfully with bookmark_id: " + bookmark.getBookmarkId());

        return ResponseEntity.ok(response);
    }

    @PostMapping("/delete_policy")
    public ResponseEntity<Map<String, Object>> deletePolicy(@RequestBody Map<String, Long> payload) {
        Long policyId = payload.get("policyId");
        if (policyId == null) {
            Map<String, Object> response = new HashMap<>();
            response.put("code", 400);
            response.put("msg", "policyId is required");
            return ResponseEntity.badRequest().body(response);
        }

        List<Bookmark> bookmarks = bookmarkRepository.findByPolicyIdAndUserName(policyId, "xuee");
        if (bookmarks.isEmpty()) {
            Map<String, Object> response = new HashMap<>();
            response.put("code", 404);
            response.put("msg", "No bookmarks found for policyId: " + policyId);
            return ResponseEntity.status(404).body(response);
        }

        bookmarkRepository.deleteAll(bookmarks);

        Map<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("msg", "Bookmarks deleted successfully for policyId: " + policyId);

        return ResponseEntity.ok(response);
    }
}
