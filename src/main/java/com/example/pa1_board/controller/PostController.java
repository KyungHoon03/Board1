package com.example.pa1_board.controller;


import com.example.pa1_board.dto.PostRequestDto;
import com.example.pa1_board.entity.Post;
import com.example.pa1_board.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor

public class PostController {
    private  final PostsService postsService;

    @GetMapping("/all")
    public List<Post> getAllPosts() {
        return postsService.getPosts();
    }

    @PostMapping("/")
    public Post createPost(@RequestBody PostRequestDto post) {

        return postsService.createpost(post);
    }

    @PostMapping("/read")
    public Post readPost(@RequestBody PostRequestDto post) {
        return postsService.incrementReadCount(post);
    }

}
