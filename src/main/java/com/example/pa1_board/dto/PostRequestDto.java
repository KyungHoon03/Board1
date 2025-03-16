package com.example.pa1_board.dto;

import com.example.pa1_board.entity.Post;

public class PostRequestDto {
    private String title;
    private String content;
    private Long userId;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
