package service;

import model.Application;
import model.DiplomaThesis;
import model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService extends UserService {
    Application application(Student student, DiplomaThesis diplomaThesis);
}
