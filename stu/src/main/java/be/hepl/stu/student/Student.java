package be.hepl.stu.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private LocalDate dob;
    private String email;


    public Student() {
    }

    public Student(Long id, String name, String surname, Integer age, LocalDate dob, String email) {
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

    public Long getId() {
        return id;
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
