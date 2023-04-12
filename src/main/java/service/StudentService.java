package service;

import model.Applications;
import model.DiplomaThesis;
import model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService extends UserService {
    Applications applications(Student student, DiplomaThesis diplomaThesisSubject);
}
