package com.example.mydiplomamanagmentapp.service;

import com.example.mydiplomamanagmentapp.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void saveUser(User user);
    public boolean isUserPresent(User user);
}
