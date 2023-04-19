package model;

import dao.ApplicationDAO;
import lombok.AllArgsConstructor;
import service.ProfessorService;

@AllArgsConstructor
public class TemplateStrategyAlgorithm implements BestApplicantStrategy {
    ApplicationDAO applicationDAO;

    private Student student;
    @Override
    public Student findBestApplicant() {
        for(Application application: applicationDAO.findAll()){

        }
    }
}
