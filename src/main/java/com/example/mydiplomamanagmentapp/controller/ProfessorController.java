package com.example.mydiplomamanagmentapp.controller;

import com.example.mydiplomamanagmentapp.model.Professor;
import com.example.mydiplomamanagmentapp.service.DiplomaSubjectService;
import com.example.mydiplomamanagmentapp.service.ProfessorService;
import com.example.mydiplomamanagmentapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.security.auth.Subject;

@Controller
public class ProfessorController {
    @Autowired
    UserService userService;
    @Autowired
    ProfessorService professorService;
    @Autowired
    DiplomaSubjectService diplomaSubjectService;

    @RequestMapping("signin/professor")
    public String getProfessorMainMenu(){

        return "professor/login";
    }

    public String retrieveProfile(Model model){
        return null;
    }

    public String saveProfile(Professor professor, Model model){
        return null;
    }

    public String listProfessorSubjects(Model model){
        return null;
    }

    public String showSubjectForm(Model model){
        return null;
    }

    public String addSubject(Subject subject, Model model){
        return null;
    }

    public String listApplications(Integer integer, Model model){
        return null;
    }

    public String assignSubject(Integer integer, Model model){
        return null;
    }

    public String listProfessorTheses(Model model){
        return null;
    }
}
