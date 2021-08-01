package com.circus.jpastudy.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 저장하기() {
        //given
        String name = "김주호";
        int age = 24;

        memberRepository.save(Member.builder()
                .name(name)
                .age(age)
                .build());

        //when
        List<Member> memberList = memberRepository.findAll();

        //then
        Member member = memberList.get(0);
        Assertions.assertThat(member.getName()).isEqualTo(name);
        Assertions.assertThat(member.getAge()).isEqualTo(age);
    }
}