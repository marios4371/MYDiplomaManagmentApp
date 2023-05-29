package com.example.mydiplomamanagmentapp.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name= "fullName")
    private String fullName;

    @Size(min= 0, max= 4, message= "Cannot apply for diploma")
    @Column(length= 2)
    private int yrsOfStudies;

    @Size(min= 0, max= 5, message= "Cannot apply for diploma")
    @Column(length= 2)
    private double grade;

    @Size(min=0, max=50, message= "Professor will choose")
    @Column(length= 2)
    private int remainCourses;

    private int regNum;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
