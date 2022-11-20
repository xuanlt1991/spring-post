package com.spring.springpost.service.impl;

import com.spring.springpost.response.PostResponseDTO;
import com.spring.springpost.entity.Post;
import com.spring.springpost.mapper.PostResponseDTOMapper;
import com.spring.springpost.repository.PostRepository;
import com.spring.springpost.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostResponseDTOMapper postResponseDTOMapper;

    public List<PostResponseDTO> getPostsByUserId(Long userId) {
        List<Post> posts = postRepository.findByUserId(userId);
        return postResponseDTOMapper.toDtoList(posts);
    }
}
