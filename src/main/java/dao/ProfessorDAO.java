package dao;

import java.util.Optional;
import model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorDAO extends JpaRepository<Professor, Integer>{

    Professor findByUsername(String username);
}
