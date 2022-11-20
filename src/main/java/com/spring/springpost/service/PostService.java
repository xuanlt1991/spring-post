package com.spring.springpost.service;

import com.spring.springpost.response.PostResponseDTO;

import java.util.List;

public interface PostService {
    List<PostResponseDTO> getPostsByUserId(Long userId);
}
