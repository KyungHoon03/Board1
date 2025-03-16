package com.example.pa1_board.repository;

import com.example.pa1_board.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostsRepository extends JpaRepository<Post, Long> {

}