package com.example.mydiplomamanagmentapp.service;

import com.example.mydiplomamanagmentapp.model.DiplomaSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DiplomaSubjectService{
    void saveDiplomaSubject(DiplomaSubject diplomaSubject);
    List<DiplomaSubject> findAll();
    DiplomaSubject findById(int id);

}
