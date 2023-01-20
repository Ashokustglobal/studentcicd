package com.example.student.service;

import com.example.student.dao.StudentRepo;
import com.example.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student geStudenttById(int studentId) {
        return studentRepo.findById(studentId).get();
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }
}
