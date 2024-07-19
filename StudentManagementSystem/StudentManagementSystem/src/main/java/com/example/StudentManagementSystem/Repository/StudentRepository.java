package com.example.StudentManagementSystem.Repository;

import com.example.StudentManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
