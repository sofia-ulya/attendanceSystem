package my.edu.utem.ftmk.dad.attendancesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.edu.utem.ftmk.dad.attendancesystem.model.Student;

/**
 * Repository interface for managing Student entities.
 * This interface extends the JpaRepository interface, providing standard CRUD operations.
 * 
 * @author ezzajeslin
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
