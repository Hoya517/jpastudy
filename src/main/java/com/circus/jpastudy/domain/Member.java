package com.circus.jpastudy.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false, length = 9, columnDefinition = "TEXT")
    private String name;

//    @Column(nullable = true)
    private int age;

    @Builder
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
