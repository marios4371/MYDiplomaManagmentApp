package com.example.mydiplomamanagmentapp.dao;

import com.example.mydiplomamanagmentapp.model.DiplomaThesis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomaThesisDAO extends JpaRepository<DiplomaThesis, Integer > {

    DiplomaThesisDAO findByTitle(String title);
}
