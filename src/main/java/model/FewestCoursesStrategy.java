package model;

import dao.ApplicationDAO;

import java.util.Random;

public class FewestCoursesStrategy extends TemplateStrategyAlgorithm{
    private int Th2;
    public FewestCoursesStrategy(ApplicationDAO applicationDAO, Student student,BestAvgGradeStrategy bestAvgGradeStrategy,FewestCoursesStrategy fewestCoursesStrategy, int th2) {
        super(student, applicationDAO, bestAvgGradeStrategy, fewestCoursesStrategy);
        this.Th2= th2;
    }

    public int compareApplications(Application application, Application app){
        if(application.getStudent().getGrade()>= Th2 && app.getStudent().getGrade()>= Th2){
            if(application.getStudent().getRemainCourses()> app.getStudent().getRemainCourses()){
                return app.getStudent().getRegNum();
            }
            else if (application.getStudent().getRemainCourses()< app.getStudent().getRemainCourses()){
                return application.getStudent().getRegNum();
            }
            return 0;
        }
        return 0;

        }
}
