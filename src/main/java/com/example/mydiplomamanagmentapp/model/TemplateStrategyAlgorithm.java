package com.example.mydiplomamanagmentapp.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public abstract class TemplateStrategyAlgorithm implements BestApplicantStrategy {
    @Override
    public Student findBestApplicant(List<Application> applications) {
        Application bestApplication= applications.get(0);
        int applicationId;
        for (int i = 0; i < applications.size(); i++) {
            applicationId= compareApplications(bestApplication, applications.get(i));
            if (applications.get(i).getId()== applicationId ) {
                bestApplication = applications.get(i);
            }
        }
        return bestApplication.getStudent();

    }

    public abstract int compareApplications(Application application, Application app);
}
