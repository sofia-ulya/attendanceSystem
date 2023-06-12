package my.edu.utem.ftmk.dad.attendancesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.edu.utem.ftmk.dad.attendancesystem.model.Examination;


/**
 * Repository interface for managing Examination entities.
 * This interface extends the JpaRepository interface, providing standard CRUD operations.
 * 
 * @author ezzajeslin
 *
 */
@Repository
public interface ExaminationRepository extends JpaRepository<Examination, Long> {

}
