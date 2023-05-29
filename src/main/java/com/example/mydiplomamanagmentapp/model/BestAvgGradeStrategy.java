package com.example.mydiplomamanagmentapp.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BestAvgGradeStrategy extends TemplateStrategyAlgorithm{
    private int Th1;

    public int compareApplications(Application application, Application app){
        if(application.getStudent().getGrade()>= Th1 && app.getStudent().getGrade()>= Th1){
            if (application.getStudent().getGrade()> app.getStudent().getGrade()){
                return application.getStudent().getRegNum();
            }
            else if (application.getStudent().getGrade()< app.getStudent().getGrade()){
                return app.getStudent().getRegNum();
            }
        }
        return 0;
    }
}
