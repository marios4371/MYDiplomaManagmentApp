package com.example.mydiplomamanagmentapp.service;

import com.example.mydiplomamanagmentapp.dao.DiplomaSubjectDAO;
import com.example.mydiplomamanagmentapp.dao.StudentDAO;
import com.example.mydiplomamanagmentapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentDAO studentDAO;
    @Autowired
    DiplomaSubjectDAO diplomaSubjectDAO;


    @Override
    public Application application(Student student, DiplomaThesis diplomaThesis) {
        return null;
    }

    @Override
    public void saveProfile(Student student){
        studentDAO.save(student);
    }

    @Override
    public Student retrieveProfile(String string) {
        return studentDAO.findByFullName(string);
    }

    @Override
    public List<DiplomaSubject> listStudentSubjects(String string) {
        Student student= studentDAO.findByFullName(string);
        if (student == null) {
            Logger logger = Logger.getLogger(StudentServiceImpl.class.getName());
            logger.warning("this combination does not exist");
            return new ArrayList<>();
        }
        List<DiplomaSubject> studentSubjects = new ArrayList<>();
        for (DiplomaSubject diplomaSubject : diplomaSubjectDAO.findAll()) {
            if (diplomaSubject.getStudent().equals(student)) {
                studentSubjects.add(diplomaSubject);
            }
        }
        return studentSubjects;
    }

    /*@Override
    public void applyToSubject(String string, Integer integer) {
        studentDAO.save(applicationDAO.findByFullName(string, integer));
    }*/


}
