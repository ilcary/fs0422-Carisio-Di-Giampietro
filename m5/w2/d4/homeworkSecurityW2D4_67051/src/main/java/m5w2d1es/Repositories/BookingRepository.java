package m5w2d1es.Repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import m5w2d1es.models.Booking;

@Repository
public interface BookingRepository extends PagingAndSortingRepository<Booking, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM bookings WHERE user_id = :userId AND validity = :validity")
	public List<Booking> getByUserAndValidity(@Param("userId") long userId, @Param("validity") LocalDate validity);

	@Query(nativeQuery = true, value = "SELECT * FROM bookings WHERE workstation_id = :workstationId AND validity = :validity")
	public List<Booking> getByWorkstationAndValidity(@Param("workstationId") long workstationId,
			@Param("validity") LocalDate validity);
}
