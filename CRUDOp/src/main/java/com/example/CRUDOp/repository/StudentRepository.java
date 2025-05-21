package com.example.CRUDOp.repository;

import com.example.CRUDOp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
