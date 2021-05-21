package com.example.study.repository;

import com.example.study.model.entity.User;
import com.example.study.AdminPageApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends AdminPageApplicationTests {


    @Autowired   //DI(Dependency Injection)
    private UserRepository userRepository;

    @Test
    public void create() {
        //String sql = insert into user(%s, %s, %d) value(account, email, age);
        User user = new User();

        user.setAccount("TestUser05");
        user.setEmail("TestUser05@gmail.com");
        user.setPhoneNumber("010-5555-5555");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser05");

        User newUser = userRepository.save(user);
        System.out.println("newUser : " + newUser);
    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }
}
