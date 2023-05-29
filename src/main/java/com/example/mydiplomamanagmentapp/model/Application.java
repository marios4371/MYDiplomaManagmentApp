package com.example.mydiplomamanagmentapp.model;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "APPLICATION")
public class Application{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(length = 15, nullable = false)
    private String subjectName;

}
