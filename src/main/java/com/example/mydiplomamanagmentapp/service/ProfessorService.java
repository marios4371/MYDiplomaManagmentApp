package com.example.mydiplomamanagmentapp.service;

import com.example.mydiplomamanagmentapp.model.Application;
import com.example.mydiplomamanagmentapp.model.DiplomaSubject;
import com.example.mydiplomamanagmentapp.model.DiplomaThesis;
import com.example.mydiplomamanagmentapp.model.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessorService{
    //Professor retrieveProfile(String username);
    void saveProfessor(Professor professor);
    List<DiplomaSubject> listProfessorSubjects(int id);
    void addDiplomaSubject(int id, DiplomaSubject diplomaSubject);
    
    DiplomaSubject allDiplomaSubjects(String title);

    void deleteDiplomaSubject(String title);

    List<Application> listApplications(String subjectName, Integer numOfApps);

    List<DiplomaThesis> listProfessorTheses(int id);

    void assignDiplomaSubject(String title, Integer integer);

}
