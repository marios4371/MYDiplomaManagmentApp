package com.example.mydiplomamanagmentapp.service;

import com.example.mydiplomamanagmentapp.dao.ApplicationDAO;
import com.example.mydiplomamanagmentapp.dao.DiplomaSubjectDAO;
import com.example.mydiplomamanagmentapp.dao.StudentDAO;
import com.example.mydiplomamanagmentapp.model.*;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class StudentServiceImpl implements StudentService{
    StudentDAO studentDAO;
    DiplomaSubjectDAO diplomaSubjectDAO;
    ApplicationDAO applicationDAO;

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

    @Override
    public void applyToSubject(String string, Integer integer) {
        studentDAO.save(applicationDAO.findByFullName(string, integer));
    }


}
