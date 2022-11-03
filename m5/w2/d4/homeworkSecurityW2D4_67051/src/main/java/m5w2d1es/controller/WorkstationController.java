package m5w2d1es.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import m5w2d1es.models.Workstation;
import m5w2d1es.models.WorkstationType;
import m5w2d1es.services.WorkstationService;

@RestController
@RequestMapping("/api/workstations")
@Slf4j
public class WorkstationController {

	@Autowired
	private WorkstationService ws;

	@GetMapping("")
	public Iterable<Workstation> searchAllWorkstations() {
		return ws.searchAllWorkstations();
	}
	
	@GetMapping("/pageable")
	public ResponseEntity<Page<Workstation>> findAll(Pageable p) {
		Page<Workstation> findAll = ws.searchAllWorkstationsPage(p);

		if (findAll.hasContent()) {
			return new ResponseEntity<>(findAll, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/searchByCityAndType")
	public List<Workstation> searchByCityAndType(@RequestParam String city, @RequestParam WorkstationType type) {
		return ws.searchWorkstation(city, type);
	}

	@PostMapping("")
	public void create(@RequestBody Workstation workstation) {
		try {
			ws.create(workstation);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@GetMapping("/{id}")
	public Workstation readById(@PathVariable Long id) {
		try {
			return ws.findById(id);
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}

	@PutMapping("")
	public void update(@RequestBody Workstation workstation) {
		try {
			ws.create(workstation);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		try {
			ws.delete(id);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
}
