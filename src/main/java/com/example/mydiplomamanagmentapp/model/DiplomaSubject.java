package com.example.mydiplomamanagmentapp.model;

import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name ="DIPLOMASUBJECT")
@SequenceGenerator(name = "idGenerator", sequenceName = "DIPLOMASUBJECT.SEQ", initialValue = 1, allocationSize = 1)
public class DiplomaSubject extends BaseId{

    @Column(length = 15,nullable = false)
    @NotNull
    private String title;

    @Column(length = 50,nullable = false)
    @NotNull
    private String objective;


    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    @NotNull
    private  Professor professor;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @NotNull
    private Student student;

}
