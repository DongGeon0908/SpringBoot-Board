package com.programmers.springbootboard.post.dto.bundle;

import com.programmers.springbootboard.member.domain.vo.Email;
import lombok.Builder;

@Builder
public class PostDeleteBundle {
    private final Email email;
    private final Long postId;

    public Email getEmail() {
        return email;
    }

    public Long getPostId() {
        return postId;
    }
}
