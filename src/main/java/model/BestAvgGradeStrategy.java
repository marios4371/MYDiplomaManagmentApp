package model;


import dao.ApplicationDAO;
import lombok.Getter;
import java.util.Random;

@Getter
public class BestAvgGradeStrategy extends TemplateStrategyAlgorithm{
    Application chosenApplications= null;
    private int Th1;
    public BestAvgGradeStrategy(ApplicationDAO applicationDAO, Student student, int Th1) {
        super(applicationDAO, student);
        this.Th1= Th1;
    }
    public int compareApplications(Application application, Application app){
        if(application.getStudent().getGrade()>= Th1 && app.getStudent().getGrade()>= Th1){
            if(application.getStudent().getGrade()== app.getStudent().getGrade()){
                Random rand = new Random();

                //..........
            }
            if (application.getStudent().getGrade()> app.getStudent().getGrade()){
                return application.getStudent().getRegNum();
            }
            return app.getStudent().getRegNum();
        }
        return 0;
    }
}
