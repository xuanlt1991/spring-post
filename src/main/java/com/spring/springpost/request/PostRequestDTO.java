package com.spring.springpost.request;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long postId;
    private Long userId;
    private String title;
    private String content;
}
