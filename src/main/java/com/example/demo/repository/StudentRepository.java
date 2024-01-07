package com.example.demo.repository;

import com.example.demo.models.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<student,Long> {

}
