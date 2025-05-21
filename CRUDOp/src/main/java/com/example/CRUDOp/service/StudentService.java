package com.example.CRUDOp.service;

import com.example.CRUDOp.model.Student;
import com.example.CRUDOp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getbyidStudents(Long rollno) {
        return studentRepository.findById(rollno).orElse(new Student());
    }

    public Student UpdateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long rollno) {
        studentRepository.deleteById(rollno);
    }

    public List<Student> getstudentsnames(String name) {
        return studentRepository.findByName(name);
    }
}
