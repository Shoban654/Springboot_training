package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.StudentsModel;
import com.example.demo.Repository.Studentsrepository;
import com.example.demo.StudentsService.StudentsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentsController {

    @Autowired
    public Studentsrepository studentsrepository;
    
    @GetMapping("")
    List<StudentsModel> getStudentsModels()
    {
        return studentsrepository.findAll();
    }

    @PostMapping("")
    public StudentsModel addStudent(@RequestBody StudentsModel studentsModel)
    {
       return studentsrepository.save(studentsModel);  
    }

    @DeleteMapping("")
    public String deletestudent(@RequestParam String firstName)
    {
        studentsrepository.deleteByFirstName(firstName);
        return "done";
    }

    @PutMapping("")
    public String updatestudent( @RequestBody StudentsModel studentsModel)
    {
        studentsrepository.save(studentsModel);
        return "updated";
    }


}
