package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("(get/{studentId})")
    public Student getStudent(@PathVariable int studentId){
        return studentService.geStudenttById(studentId);
    }
    @GetMapping(("/getAll"))
    public List<Student> getAll(@RequestBody Student student){
        return studentService.getAllStudent();
    }
}
