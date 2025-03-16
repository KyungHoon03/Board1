package com.example.pa1_board.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 50, unique = true)
    private String nickname; // nickname 컬럼 (NOT NULL, VARCHAR(50))

    @Column(nullable = false, length = 100, unique = true)
    private String email; // email 컬럼 (NOT NULL, UNIQUE, VARCHAR(100))

    @Column(nullable = false, length = 50)
    private String password;




}
