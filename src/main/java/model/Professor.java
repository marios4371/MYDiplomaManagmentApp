package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
public class Professor {
    private int professorId;
    private String fullName;
    private String speciality;

    private DiplomaThesis diplomaThesis;
    //private List<DiplomaSubject> diplomaSubject;

}
