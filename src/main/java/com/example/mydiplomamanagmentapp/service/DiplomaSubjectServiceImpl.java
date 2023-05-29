package com.example.mydiplomamanagmentapp.service;

import com.example.mydiplomamanagmentapp.dao.DiplomaSubjectDAO;
import com.example.mydiplomamanagmentapp.model.DiplomaSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiplomaSubjectServiceImpl implements DiplomaSubjectService {
    @Autowired
    DiplomaSubjectDAO diplomaSubjectDAO;

    @Override
    public void saveDiplomaSubject(DiplomaSubject diplomaSubject) {
        diplomaSubjectDAO.save(diplomaSubject);
    }

    @Override
    public List<DiplomaSubject> findAll() {
        return diplomaSubjectDAO.findAll();
    }

    @Override
    public DiplomaSubject findById(int id) {
        return diplomaSubjectDAO.findById(id);
    }
}
