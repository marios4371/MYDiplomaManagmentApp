package com.example.mydiplomamanagmentapp.model;

import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "DIPLOMATHESIS")
public class DiplomaThesis{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 10, nullable = false)
    private String title;

    @Column(length = 4, nullable = false )
    private int availability;

    @Column(length = 20, nullable = false)
    private String objective;

    @OneToOne
    @JoinColumn(name = "subject_id")
    private DiplomaSubject diplomaSubject;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

}
