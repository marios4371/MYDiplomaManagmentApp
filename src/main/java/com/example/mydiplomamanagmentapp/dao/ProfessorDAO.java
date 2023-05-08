package com.example.mydiplomamanagmentapp.dao;

import com.example.mydiplomamanagmentapp.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorDAO extends JpaRepository<Professor, Integer>{

    Professor findByFullName(String fullName);
}
