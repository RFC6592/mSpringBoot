package be.hepl.stu.student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="student")
public class Student {

    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="age")
    private Integer age;
    @Column(name="dob")
    private LocalDate dob;
    @Column(name="email")
    private String email;


    public Student() {
    }

    public Student(Integer id, String name, String surname, Integer age, LocalDate dob, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public Student(String name, String surname, Integer age, LocalDate dob, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
