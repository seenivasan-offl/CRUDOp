package com.example.CRUDOp.controller;

import com.example.CRUDOp.model.Student;
import com.example.CRUDOp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Successfully added";
    }
}
