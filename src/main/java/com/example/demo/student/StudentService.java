package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1,
                        "BLitz",
                        "bliyz@gmail.com",
                        LocalDate.of(2001, Month.AUGUST,6),
                        19
                )
        );
    }
}
