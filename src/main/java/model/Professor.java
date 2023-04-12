package model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
public class Professor {
    private int professorId;
    private String fullName;
    private String speciality;

    private DiplomaThesis diplomaThesis;
    private DiplomaSubject diplomaSubject;
}
