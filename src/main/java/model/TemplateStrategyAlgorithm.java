package model;

import dao.ApplicationDAO;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class TemplateStrategyAlgorithm implements BestApplicantStrategy {
    Student student;
    ApplicationDAO applicationDAO;
    BestAvgGradeStrategy bestAvgGradeStrategy;
    FewestCoursesStrategy fewestCoursesStrategy;

    @Override
    public Student findBestApplicant(List<Application> applications) {
        return null;
    }

    public int compareApplications(Application application, Application app) {
        List<Application> applicants = applicationDAO.findAll();
        List<Application> bestApplicant = new ArrayList<>();
        for (int i = 0; i < applicants.size(); i++) {
            if ((bestAvgGradeStrategy.compareApplications(applicants.get(i), applicants.get(i+1)) == fewestCoursesStrategy.compareApplications(applicants.get(i), applicants.get(i+1))) == true ) {
                return bestAvgGradeStrategy.compareApplications(applicants.get(i), applicants.get(i+1));
            }

        }
        return 0;
    }
}
