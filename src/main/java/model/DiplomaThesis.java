package model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
public class DiplomaThesis implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String title;
    private String availability;
    private String objective;

    private DiplomaSubject diplomaSubject;
    private Student student;
    private Professor professor;

}
