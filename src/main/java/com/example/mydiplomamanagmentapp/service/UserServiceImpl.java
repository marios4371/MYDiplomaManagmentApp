package com.example.mydiplomamanagmentapp.service;

import com.example.mydiplomamanagmentapp.dao.UserDAO;
import com.example.mydiplomamanagmentapp.model.Professor;
import com.example.mydiplomamanagmentapp.model.Role;
import com.example.mydiplomamanagmentapp.model.Student;
import com.example.mydiplomamanagmentapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private ProfessorServiceImpl professorService;
    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void saveUser(User user) {
        String encodePass = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodePass);
        userDAO.save(user);
        //System.out.println("EDW");
        if(user.getRole().equals(Role.PROFESSOR)){
            System.out.println("EDW");
            Professor professor= new Professor();
            professor.setUser(user);
            professorService.saveProfessor(professor);
        }
        else if(user.getRole().equals(Role.STUDENT)){
            System.out.println("EDW");
            Student student= new Student();
            student.setUser(user);
            studentService.saveProfile(student);
        }
    }

    @Override
    public boolean isUserPresent(User user) {
        Optional<User> isUserPresent = userDAO.findByUsername(user.getUsername());
        return isUserPresent.isPresent();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDAO.findByUsername(username).orElseThrow(
                ()-> new UsernameNotFoundException(
                        String.format("UserNameNotFound",username)
                ));

    }
}
