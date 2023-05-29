package com.example.mydiplomamanagmentapp.dao;

import com.example.mydiplomamanagmentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {
    Student findByFullName(String fullName);

}
