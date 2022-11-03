package m5w2d1es.Repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import m5w2d1es.models.Building;

@Repository
public interface BuildingRepository extends PagingAndSortingRepository<Building, Long> {

}
