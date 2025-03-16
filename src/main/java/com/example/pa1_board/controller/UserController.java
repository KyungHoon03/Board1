package com.example.pa1_board.controller;


import com.example.pa1_board.dto.UserDto;
import com.example.pa1_board.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public String getUser(@ModelAttribute UserDto userDto) {
    return userService.userLogin(userDto);
    }
}
