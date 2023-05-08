package com.example.mydiplomamanagmentapp.model;

import java.util.List;

public interface BestApplicantStrategy {
    Student findBestApplicant(List<Application> applications);
}
