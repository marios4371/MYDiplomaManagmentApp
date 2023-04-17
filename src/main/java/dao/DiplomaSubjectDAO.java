package dao;

import model.DiplomaSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomaSubjectDAO extends JpaRepository<DiplomaSubject, Integer> {
    DiplomaSubject findByTitle(String title);
}
