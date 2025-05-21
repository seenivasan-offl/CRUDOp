package com.example.CRUDOp.model;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class Student {
    @Id
    private Long rollno;
    private String name;
    private String department;
}
