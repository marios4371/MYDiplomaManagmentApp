package service;

import dao.DiplomaSubjectDAO;
import dao.ProfessorDAO;
import model.Application;
import model.DiplomaSubject;
import model.DiplomaThesis;
import model.Professor;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;
import java.util.List;

import static jdk.internal.foreign.abi.Binding.builder;

@Service
public class ProfessorServiceImpl extends UserServiceImpl implements ProfessorService{
    ProfessorDAO professorDAO;
    DiplomaSubjectDAO diplomaSubjectDAO;

    @Override
    public Professor retrieveProfile(String username) {
        return professorDAO.findByUsername(username);
    }

    private boolean checkNullability(DiplomaSubject diplomaSubject, String fullName) {
        Logger logger = Logger.getLogger(ProfessorServiceImpl.class.getName());
        if (diplomaSubject == null) {

            logger.warning("Subject is null.");
            return true;
        }
        if (fullName == null) {

            logger.warning("Name is null.");
            return true;
        }

        return false;
    }


    @Override
    public void addDiplomaSubject(DiplomaSubject diplomaSubject,String fullName) {
        if(checkNullability(diplomaSubject, fullName)){
           //listProfessorSubjects().add(diplomaSubject.getTitle());
        }
    }


    @Override
    public List<DiplomaSubject> listProfessorSubjects(String title) {
        return listProfessorSubjects(title);

    }
    @Override
    public void deleteDiplomaSubject(String title) {

    }

    @Override
    public List<Application> listApplications(String subjectName, Integer numOfApps) {
        return null;
    }

    @Override
    public List<DiplomaThesis> listProfessorTheses(String title) {
        return null;
    }

    @Override
    public void assignDiplomaSubject(String title, Integer remSubject) {

    }
}
