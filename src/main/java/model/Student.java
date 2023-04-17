package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
public class Student  {
    private String fullName;
    private int yrsOfStudies;
    private double grade;
    private int remainCourses;
    private Application applications;
}
