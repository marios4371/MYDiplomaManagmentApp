package com.example.mydiplomamanagmentapp.service;

import com.example.mydiplomamanagmentapp.model.Application;
import com.example.mydiplomamanagmentapp.model.DiplomaSubject;
import com.example.mydiplomamanagmentapp.model.DiplomaThesis;
import com.example.mydiplomamanagmentapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Application application(Student student, DiplomaThesis diplomaThesis);

    void saveProfile(Student student);
    Student retrieveProfile(String string);
    List<DiplomaSubject> listStudentSubjects(String fullName);
    //void applyToSubject(String string, Integer integer);
}
