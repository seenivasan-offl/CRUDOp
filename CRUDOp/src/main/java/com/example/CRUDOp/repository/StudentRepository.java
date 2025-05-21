package com.example.CRUDOp.repository;

import com.example.CRUDOp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByName(String name);
=======
public interface StudentRepository extends JpaRepository<Student,Long> {
>>>>>>> 6b8ca155852eedf7a4744396e8d00360182eed1c
}
