package m5w2d1es.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import m5w2d1es.models.Workstation;
import m5w2d1es.models.WorkstationType;

@Repository
public interface WorkstationRepository extends PagingAndSortingRepository<Workstation, Long> {

	@Query("SELECT w FROM Workstation w WHERE w.building.city =:city AND w.type =:type")
	public List<Workstation> findByCityAndType(@Param("city") String city, @Param("type") WorkstationType type);
}
