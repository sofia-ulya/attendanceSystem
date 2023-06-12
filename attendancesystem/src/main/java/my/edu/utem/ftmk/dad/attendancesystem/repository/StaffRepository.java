package my.edu.utem.ftmk.dad.attendancesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.edu.utem.ftmk.dad.attendancesystem.model.Staff;

/**
 * Repository interface for managing Staff entities.
 * This interface extends the JpaRepository interface, providing standard CRUD operations.
 * 
 * @author ezzajeslin
 *
 */
@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

}
