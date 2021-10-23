package be.hepl.stu.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDAO repository;

    public List<Student> getAllStudents()
    {
        return repository.findAll();
    }


    public void save(Student student) {
        repository.save(student);
    }
}
