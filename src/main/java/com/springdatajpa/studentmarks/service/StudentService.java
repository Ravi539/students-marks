package com.springdatajpa.studentmarks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springdatajpa.studentmarks.entity.Student;
import com.springdatajpa.studentmarks.repository.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
