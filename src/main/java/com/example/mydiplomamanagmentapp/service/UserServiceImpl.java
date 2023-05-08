package com.example.mydiplomamanagmentapp.service;

import com.example.mydiplomamanagmentapp.dao.UserDAO;
import com.example.mydiplomamanagmentapp.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    private UserDAO userDAO;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void saveUser(User user) {
        String encodePass = bCryptPasswordEncoder.encode(user.getPassword());
        userDAO.save(user);
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
