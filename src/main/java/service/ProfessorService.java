package service;

import org.springframework.stereotype.Service;

@Service
public interface ProfessorService extends UserService{

    void addDiploma(String title);

    void deleteDiploma(String title);
}
