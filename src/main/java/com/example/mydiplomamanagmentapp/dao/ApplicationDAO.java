package com.example.mydiplomamanagmentapp.dao;

import com.example.mydiplomamanagmentapp.model.Application;
import com.example.mydiplomamanagmentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDAO extends JpaRepository<Application, Integer> {
    @Query(value = "select fullName, regNum FROM Student", nativeQuery = true)
    Student findByFullName(String fullName, Integer integer);



}
