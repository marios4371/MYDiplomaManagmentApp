package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomaThesis extends JpaRepository {

    DiplomaThesis findByTitle(String title);
}
