package com.nikeshcode.studentsystem.service;

import com.nikeshcode.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent (Student student);
    public List<Student> getAllStudents();
}
