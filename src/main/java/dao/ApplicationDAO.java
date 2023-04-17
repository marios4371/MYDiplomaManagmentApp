package dao;

import model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDAO extends JpaRepository<Application, Integer> {
    Application findByTitle(String title);
}
