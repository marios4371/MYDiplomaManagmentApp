package com.example.mydiplomamanagmentapp.model;

import lombok.Getter;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;


@Getter
@ToString
@MappedSuperclass
public abstract class BaseId implements Serializable {



        @Serial
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idGenerator")
        @Column(updatable = false)
        private Long id;
}

