package com.example.mydiplomamanagmentapp.service;

import com.example.mydiplomamanagmentapp.dao.DiplomaSubjectDAO;
import com.example.mydiplomamanagmentapp.dao.DiplomaThesisDAO;
import com.example.mydiplomamanagmentapp.dao.ProfessorDAO;
import com.example.mydiplomamanagmentapp.model.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.List;


@Service
public class ProfessorServiceImpl implements ProfessorService{
    ProfessorDAO professorDAO;
    DiplomaSubjectDAO diplomaSubjectDAO;
    DiplomaThesisDAO diplomaThesisDAO;



    @Override
    public Professor retrieveProfile(String fullName) {
        return professorDAO.findByFullName(fullName);
    }
    @Override
    public void saveProfessor(Professor professor){
        professorDAO.save(professor);
    }

    private boolean checkNullability(DiplomaSubject diplomaSubject, String fullName) {
        Logger logger = Logger.getLogger(ProfessorServiceImpl.class.getName());
        if (diplomaSubject == null) {

            logger.warning("Subject is null.");
            return true;
        }
        if (fullName == null) {

            logger.warning("Name is null.");
            return true;
        }

        return false;
    }


    @Override
    public void addDiplomaSubject(String fullName, DiplomaSubject diplomaSubject) {
        if(checkNullability(diplomaSubject, fullName)){
            return;
        }
        Professor professor = professorDAO.findByFullName(fullName);
        if (professor == null) {
            Logger logger = Logger.getLogger(ProfessorServiceImpl.class.getName());
            logger.warning("Professor with the given name does not exist.");
            return;
        }
        diplomaSubject.setProfessor(professor);
        diplomaSubjectDAO.save(diplomaSubject);
    }

    @Override
    public DiplomaSubject allDiplomaSubjects(String title) {
        return diplomaSubjectDAO.findByTitle(title);
    }

    @Override
    public List<DiplomaSubject> listProfessorSubjects(String fullName) {
        Professor professor = professorDAO.findByFullName(fullName);
        if (professor == null) {
            Logger logger = Logger.getLogger(ProfessorServiceImpl.class.getName());
            logger.warning("Professor with the given name does not exist.");
            return new ArrayList<>();
        }
        List<DiplomaSubject> professorSubjects = new ArrayList<>();
        for (DiplomaSubject diplomaSubject : diplomaSubjectDAO.findAll()) {
            if (diplomaSubject.getProfessor().equals(professor)) {
                professorSubjects.add(diplomaSubject);
            }
        }
        return professorSubjects;
    }


    @Override
    public void deleteDiplomaSubject(String title) {
        DiplomaSubject diplomaSubject = diplomaSubjectDAO.findByTitle(title);
        if (diplomaSubject != null) {
            diplomaSubjectDAO.delete(diplomaSubject);
        }
    }

    @Override
    public List<Application> listApplications(String subjectName, Integer numOfApps) {
        DiplomaSubject diplomaSubject = diplomaSubjectDAO.findByTitle(subjectName);
        if (diplomaSubject == null) {
            Logger logger = Logger.getLogger(ProfessorServiceImpl.class.getName());
            logger.warning("Diploma subject with the given title does not exist.");
            return new ArrayList<>();
        }
        List<Application> applications = new ArrayList<>();
        applications.add(diplomaSubject.getApplication());
        if (numOfApps != null && applications.size() > numOfApps) {
            return applications.subList(0, numOfApps);
        }
        return applications;
    }

    @Override
    public List<DiplomaThesis> listProfessorTheses(String fullName) {
        Professor professor = professorDAO.findByFullName(fullName);
        if (professor == null) {
            Logger logger = Logger.getLogger(ProfessorServiceImpl.class.getName());
            logger.warning("Professor with the given name does not exist.");
            return new ArrayList<>();
        }
        List<DiplomaThesis> professorTheses = new ArrayList<>();
        for (DiplomaThesis diplomaThesis : diplomaThesisDAO.findAll()) {
            if (diplomaThesis.getProfessor().equals(professor)) {
                professorTheses.add(diplomaThesis);
            }
        }
        return professorTheses;
    }

    @Override
    public void assignDiplomaSubject(String title, Integer integer) {

    }

}
