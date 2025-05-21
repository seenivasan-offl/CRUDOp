package com.example.CRUDOp.service;

import com.example.CRUDOp.model.Student;
import com.example.CRUDOp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> 6b8ca155852eedf7a4744396e8d00360182eed1c

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
<<<<<<< HEAD

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
=======
>>>>>>> 6b8ca155852eedf7a4744396e8d00360182eed1c
}
