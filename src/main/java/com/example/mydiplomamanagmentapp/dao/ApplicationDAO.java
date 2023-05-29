package com.example.mydiplomamanagmentapp.dao;

import com.example.mydiplomamanagmentapp.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDAO extends JpaRepository<Application, Integer> {

    //Student findByFullName(String string, Integer integer);



}
