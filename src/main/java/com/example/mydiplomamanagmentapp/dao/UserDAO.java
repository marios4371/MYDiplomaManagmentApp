package com.example.mydiplomamanagmentapp.dao;
import com.example.mydiplomamanagmentapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
    @Query(value= "select * FROM USERS users where users.status= 1 ", nativeQuery= true)
    Optional<User> findByUsername(String username);
}
