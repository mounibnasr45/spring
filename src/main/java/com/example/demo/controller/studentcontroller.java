package com.example.demo.controller;

import com.example.demo.models.student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class studentcontroller {

    @Autowired
    private StudentService studentService;

    // Endpoint pour récupérer tous les étudiants
    @GetMapping("/getall")
    public List<student> getAllStudents() {
        return studentService.getAllstudents();
    }

    // Endpoint pour ajouter un étudiant
    @PostMapping("/add")
    public String addStudent(@RequestBody student student) {

        return studentService.addStudent(student);
    }

    // Endpoint pour supprimer un étudiant
    @DeleteMapping("/delete/{id}")
    public String removeStudent(@PathVariable Long id) {
        student st = new student();
        st.setId(id);
        return studentService.removeStudent(st);
    }
}
