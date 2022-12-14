package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student blitz=new Student(
                    "BLitz",
                    "bliyz@gmail.com",
                    LocalDate.of(2001, AUGUST,6),
                    19
            );
            Student habibi=new Student(
                    "Al Habibi",
                    "habibi@gmail.com",
                    LocalDate.of(2004, JANUARY,20),
                    19
            );
            repository.saveAll(
                    List.of(blitz,habibi)
            );
        };
    }
}
