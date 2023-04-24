package model;


import dao.ApplicationDAO;
import lombok.Getter;

@Getter
public class BestAvgGradeStrategy extends TemplateStrategyAlgorithm{
    private int Th1;
    public BestAvgGradeStrategy(ApplicationDAO applicationDAO, Student student, BestAvgGradeStrategy bestAvgGradeStrategy, FewestCoursesStrategy fewestCoursesStrategy, int th1) {
        super(student, applicationDAO, bestAvgGradeStrategy, fewestCoursesStrategy);
        this.Th1= th1;
    }
    public int compareApplications(Application application, Application app){
        if(application.getStudent().getGrade()>= Th1 && app.getStudent().getGrade()>= Th1){
            if (application.getStudent().getGrade()> app.getStudent().getGrade()){
                return application.getStudent().getRegNum();
            }
            else if (application.getStudent().getGrade()< app.getStudent().getGrade()){
                return app.getStudent().getRegNum();
            }
            return 0;
        }
        return 0;
    }
}
