package com.example.pa1_board.service;


import com.example.pa1_board.dto.PostRequestDto;
import com.example.pa1_board.entity.Post;
import com.example.pa1_board.entity.User;
import com.example.pa1_board.repository.PostsRepository;
import com.example.pa1_board.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Slf4j
@Service
@RequiredArgsConstructor

public class PostsService {
    private final PostsRepository postsRepository;
    private final UsersRepository usersRepository;

    public List<Post> getPosts() {
        return postsRepository.findAll();
    }

    public Post createpost(PostRequestDto postRequestDto) {
        String title = postRequestDto.getTitle();
        String content = postRequestDto.getContent();
        Long userId = postRequestDto.getUserId();

        final User user = usersRepository.findById(userId).orElse(null);

        if (user == null) {
            return null;
        }
        Post post = new Post();
        post.setUser(user);
        post.setTitle(title);
        post.setContent(content);

        return postsRepository.save(post);
    }

    public Post incrementReadCount(PostRequestDto postRequestDto) {
        Long postId = postRequestDto.getUserId();

        final Post post = postsRepository.findById(postId).orElse(null);
        if (post == null) {
            return null;
        }
        post.setReadCount(post.getReadCount() + 1);

        return postsRepository.save(post);

    }

}
