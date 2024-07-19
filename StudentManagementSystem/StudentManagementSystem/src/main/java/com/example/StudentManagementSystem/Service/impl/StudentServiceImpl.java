package com.example.StudentManagementSystem.Service.impl;

import com.example.StudentManagementSystem.Entity.Student;
import com.example.StudentManagementSystem.Repository.StudentRepository;
import com.example.StudentManagementSystem.Service.StudentService;
import com.example.StudentManagementSystem.dto.StudentDto;
import com.example.StudentManagementSystem.exception.ResourceNotFoundException;
import com.example.StudentManagementSystem.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public StudentDto createStudent(StudentDto studentDto) {

        Student student = StudentMapper.mapToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);

        return StudentMapper.mapToStudentDto(savedStudent);
    }

    @Override
    public StudentDto getStudentById(Long studentid) {
        Student student = studentRepository.findById(studentid)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Student with id " + studentid + " not found"));
        return StudentMapper.mapToStudentDto(student);
    }

}
