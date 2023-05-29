package com.example.mydiplomamanagmentapp.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FewestCoursesStrategy extends TemplateStrategyAlgorithm{
    private int Th2;


    public int compareApplications(Application application, Application app){
        if(application.getStudent().getGrade()>= Th2 && app.getStudent().getGrade()>= Th2){
            if(application.getStudent().getRemainCourses()> app.getStudent().getRemainCourses()){
                return app.getStudent().getRegNum();
            }
            else if (application.getStudent().getRemainCourses()< app.getStudent().getRemainCourses()){
                return application.getStudent().getRegNum();
            }

        }
        return 0;

        }
}
