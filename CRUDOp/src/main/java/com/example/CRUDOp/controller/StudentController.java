package com.example.CRUDOp.controller;

import com.example.CRUDOp.model.Student;
import com.example.CRUDOp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
>>>>>>> 6b8ca155852eedf7a4744396e8d00360182eed1c

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
<<<<<<< HEAD
    @GetMapping("/students/{rollno}")
    public Student getbyidStudent(@PathVariable Long rollno){
        return studentService.getbyidStudents(rollno);
    }
    @PutMapping("/students")
    public String UpdateStudent(@RequestBody Student student){
        studentService.UpdateStudent(student);
        return "Successfully update";
    }
    @DeleteMapping("/students/{rollno}")
    public String deletestudent(@PathVariable Long rollno){
        studentService.deleteStudent(rollno);
        return "Successfully deleted";
    }
    @GetMapping("/students/name/{name}")
    public List<Student> getstudentsname(@PathVariable("name") String name){
        return studentService.getstudentsnames(name);
    }
=======
>>>>>>> 6b8ca155852eedf7a4744396e8d00360182eed1c
}
