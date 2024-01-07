package com.example.demo.service;

import com.example.demo.models.student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<student> getAllstudents() {
        try {
            List<student> students = studentRepository.findAll();
            List<student> customstudents = new ArrayList<>();

            students.forEach(e -> {
                student customstudent = new student();
                BeanUtils.copyProperties(e, customstudent);
                customstudents.add(customstudent);
            });

            return customstudents;
        } catch (Exception e) {
            // Gérer l'exception de manière appropriée, vous pouvez également logger l'erreur
            throw new RuntimeException("Erreur lors de la récupération des étudiants", e);
        }
    }

    public String addStudent(student st) {
        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getNote());
        System.out.println(st.getNbAbs());
        studentRepository.save(st);
        return "Étudiant ajouté avec succès.";
    }

    public String removeStudent(student st) {
        try {
            if (studentRepository.existsById(st.getId())) {
                studentRepository.delete(st);
                return "Student deleted successfully.";
            } else {
                return "Student does not exist.";
            }
        } catch (Exception e) {
            // Gérer l'exception de manière appropriée, vous pouvez également logger l'erreur
            throw new RuntimeException("Erreur lors de la suppression de l'étudiant", e);
        }
    }
}
