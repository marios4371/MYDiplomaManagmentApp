package service;

import model.Application;
import model.DiplomaThesis;
import model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends UserServiceImpl implements StudentService{

    @Override
    public Application application(Student student, DiplomaThesis diplomaThesis) {
        return null;
    }
}
