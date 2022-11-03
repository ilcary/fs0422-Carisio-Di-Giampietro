package m5w2d1es.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import m5w2d1es.ExceptionControl.BookingException;
import m5w2d1es.Repositories.BuildingRepository;
import m5w2d1es.models.Building;

@Service
public class BuildingService {

	@Autowired
	private BuildingRepository br;

	public Iterable<Building> searchAllBuildings() {
		return br.findAll();
	}

	public Page<Building> searchAllBuildingsPaginate(Pageable p) {
		return br.findAll(p);
	}
	
	public void create(Building building) {
		br.save(building);
	}

	public Building findById(long id) {
		return br.findById(id)
				.get();
	}
	
	public Building update(Long id, Building building) {
		Optional<Building> buildingRes = br.findById(id);

		if (buildingRes.isPresent()) {
			Building buildingUp = buildingRes.get();
			buildingUp.setName(building.getName());
			buildingUp.setCity(building.getCity());
			buildingUp.setAddress(building.getAddress());
			br.save(buildingUp);
			return buildingUp;
		} else {
			throw new BookingException("Building non aggiornato");
		}

	}

	public void delete(long id) {
		br.deleteById(id);
	}
}
