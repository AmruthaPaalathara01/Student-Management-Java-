package com.example.StudentManagementSystem.mapper;

import com.example.StudentManagementSystem.Entity.Student;
import com.example.StudentManagementSystem.dto.StudentDto;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student) {
        return new StudentDto (
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getCourse()
        );
    }

    public static Student mapToStudent(StudentDto studentDto) {
        return new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail(),
                studentDto.getCourse()
        );
    }
}
