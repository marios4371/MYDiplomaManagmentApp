package service;

import model.Application;
import model.DiplomaSubject;
import model.DiplomaThesis;
import model.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessorService extends UserService{
    Professor retrieveProfile(String username);

    List<DiplomaSubject> listProfessorSubjects(String title);
    void addDiplomaSubject(DiplomaSubject diplomaSubject, String title);

    void deleteDiplomaSubject(String title);

    List<Application> listApplications(String subjectName, Integer numOfApps);

    List<DiplomaThesis> listProfessorTheses(String title);

    void assignDiplomaSubject(String title, Integer remSubject);

}
