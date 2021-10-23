package be.hepl.stu.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



// JpaRepository permet de nous fournir une implementation basique pour CRUD
@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {

}
