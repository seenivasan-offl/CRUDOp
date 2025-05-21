package com.example.CRUDOp.model;

import jakarta.persistence.*;
<<<<<<< HEAD

=======
import lombok.Data;
>>>>>>> 6b8ca155852eedf7a4744396e8d00360182eed1c



@Entity
<<<<<<< HEAD

=======
@Data
>>>>>>> 6b8ca155852eedf7a4744396e8d00360182eed1c
public class Student {
    @Id
    private Long rollno;
    private String name;
<<<<<<< HEAD

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Long getRollno() {
        return rollno;
    }

    public void setRollno(Long rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

=======
>>>>>>> 6b8ca155852eedf7a4744396e8d00360182eed1c
    private String department;
}
