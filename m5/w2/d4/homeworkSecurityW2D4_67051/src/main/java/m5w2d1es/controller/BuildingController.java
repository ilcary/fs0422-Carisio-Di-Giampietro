package m5w2d1es.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import m5w2d1es.models.Building;
import m5w2d1es.services.BuildingService;

@RestController
@RequestMapping("/api/buildings")
@Slf4j
public class BuildingController {

	@Autowired
	private BuildingService bs;

	@GetMapping("")
	public Iterable<Building> searchAllBuildings() {
		return bs.searchAllBuildings();
	}
	
	@GetMapping("/paginate")
	public ResponseEntity<Page<Building>> findAll(Pageable p) {
		Page<Building> findAll = bs.searchAllBuildingsPaginate(p);

		if (findAll.hasContent()) {
			return new ResponseEntity<>(findAll, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

	}

	@PostMapping("")
	public void create(@RequestBody Building building) {
		try {
			bs.create(building);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@GetMapping("/{id}")
	public Building readById(@PathVariable Long id) {
		try {
			return bs.findById(id);
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}

	@PutMapping("/api/buildings")
	public void update(@RequestBody Building building) {
		try {
			bs.create(building);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@DeleteMapping("/api/buildings/{id}")
	public void deleteById(@PathVariable Long id) {
		try {
			bs.delete(id);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
}
