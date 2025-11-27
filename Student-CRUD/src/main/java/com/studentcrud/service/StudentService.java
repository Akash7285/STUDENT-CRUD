package com.studentcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcrud.entity.Student;
import com.studentcrud.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Create
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Read all
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Read by id
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Update
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    // Delete
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
