package com.spring.springpost.mapper;

import com.spring.springcommon.mapper.EntityMapper;
import com.spring.springcommon.request.PostRequestDTO;
import com.spring.springpost.entity.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostRequestDTOMapper extends EntityMapper<PostRequestDTO, Post> {
}
