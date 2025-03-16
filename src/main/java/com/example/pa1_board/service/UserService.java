package com.example.pa1_board.service;


import com.example.pa1_board.dto.UserDto;
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
@Service
@Slf4j
@RequiredArgsConstructor

public class UserService {
    private final UsersRepository usersRepository;

    public String userLogin(UserDto userDto) {
        String nickname = userDto.getNickname();
        String password = userDto.getPassword();
        String email = userDto.getEmail();

        User user = new User();
        user.setNickname(nickname);
        user.setEmail(email);
        user.setPassword(password);
        usersRepository.save(user);

        return user.getNickname();
    }

}
