package be.hepl.stu.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {

        return Arrays.asList(
                new Student(1L,
                        "Homer",
                        "Simpson",
                        65,
                        LocalDate.of(1956, Month.MAY, 12),
                        "homer.simpson@student.hepl.be")
        );
    }
}
