package com.spring.springpost.controller;

import com.spring.springpost.response.PostResponseDTO;
import com.spring.springpost.service.PostService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts/user")
    public ResponseEntity<List<PostResponseDTO>> getPostsByUserId(@RequestParam Long userId) {
        return ResponseEntity.ok(postService.getPostsByUserId(userId));
    }
}
