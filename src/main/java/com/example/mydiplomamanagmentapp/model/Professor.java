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
@Table(name = "PROFESSOR")
@SequenceGenerator(name = "idGenerator", sequenceName = "PROFESSOR.SEQ", initialValue = 1, allocationSize = 1)
public class Professor extends BaseId {

    @Column(length = 50, nullable = false, unique = true)
    @NotNull
    private String fullName;

    @Column(length = 50, nullable = false, unique = true)
    @NotNull
    private String password;

    @Column(length = 20, nullable = false)
    @NotNull
    private String speciality;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
