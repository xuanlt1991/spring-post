package com.spring.springpost.mapper;

import com.spring.springcommon.mapper.EntityMapper;
import com.spring.springpost.entity.Post;
import com.spring.springpost.response.PostResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostResponseDTOMapper extends EntityMapper<PostResponseDTO, Post> {
}
