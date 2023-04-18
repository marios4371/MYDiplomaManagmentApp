package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
public class DiplomaSubject {

    private String title;
    private String objective;
    private Application application;
    private  Professor professor;
}
