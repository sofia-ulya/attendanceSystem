package my.edu.utem.ftmk.dad.attendancesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.edu.utem.ftmk.dad.attendancesystem.model.Subject;

/**
 * Repository interface for managing Subject entities.
 * This interface extends the JpaRepository interface, providing standard CRUD operations.
 * 
 * @author ezzajeslin
 *
 */
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
