package be.hepl.stu.student;

// Classe qui va contenir l'ensemble des ressources de notre API

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    // Nous voulons que studentService soit injecté
    // Avec l'annotation @Autowired, cela va être automatiquement instancié pour nous et être injecté dans le constructeur
    // Ensuite, nous devons spécifier que la classe StudentService est un spring bean, graçe à
    // l'annotation @Component, on sait comme trouver le bean studentService maintenant
    // Cependant, dans notre cas on veut que ça soit @Service
    // Au lieu de : this.studentService = new StudentService();

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/add")
    public void insertStudent(Student student)
    {
        studentService.save(student);
    }
}
