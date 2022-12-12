package com.example.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/api")
public class StudentsController {
    @GetMapping("/students")
    public String getstudents_strength()
    {
        return "student strength is 30";
    }
    @PostMapping("/students")
    public String post_studentnames()
    {
        return "student1 added";
    }
    @DeleteMapping("/students")
    public String delete_studentnames()
    {
        return "student1 deleted";
    }
    @PutMapping("/students")
    public String add_student()
    {
        return "student1 edited";
    }
    @PatchMapping("/students")
    public String patch_student()
    {
        return "student1 details edited";
    }
}
