package com.excalibur.course.config;

import com.excalibur.course.entities.User;
import com.excalibur.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Alexia Straza", "alexia@gmail.com", "477777777", "10101");
        User u2 = new User(null, "Sylnas Storm", "sylnas@gmail.com", "744444444", "10101");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
