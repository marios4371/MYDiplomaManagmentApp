package service;

import model.Applications;
import model.DiplomaThesis;
import model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends UserServiceImpl implements StudentService{

    @Override
    public Applications applications(Student student, DiplomaThesis diplomaThesisSubject) {
        return null;
    }
}
