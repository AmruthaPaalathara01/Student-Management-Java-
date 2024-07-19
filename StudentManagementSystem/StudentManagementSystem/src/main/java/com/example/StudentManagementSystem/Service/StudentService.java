package com.example.StudentManagementSystem.Service;

import com.example.StudentManagementSystem.dto.StudentDto;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);

    StudentDto getStudentById(Long studentid);
}
