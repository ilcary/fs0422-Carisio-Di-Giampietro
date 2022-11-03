package m5w2d1es.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import m5w2d1es.ExceptionControl.BookingException;
import m5w2d1es.Repositories.WorkstationRepository;
import m5w2d1es.models.Workstation;
import m5w2d1es.models.WorkstationType;

@Service
public class WorkstationService {

	@Autowired
	private WorkstationRepository wr;

	public List<Workstation> searchWorkstation(String city, WorkstationType type) {
		return wr.findByCityAndType(city, type);
	}

	public Iterable<Workstation> searchAllWorkstations() {
		return wr.findAll();
	}
	
	public Page<Workstation> searchAllWorkstationsPage(Pageable p) {
		return wr.findAll(p);
	}

	public void create(Workstation workstation) {
		wr.save(workstation);
	}

	public Workstation findById(long id) {
		return wr.findById(id).get();
	}
	
	
	public Workstation update(Long id, Workstation workstation) {
		Optional<Workstation> workstationRes = wr.findById(id);

		if (workstationRes.isPresent()) {
			Workstation workstationUP = workstationRes.get();
			workstationUP.setDescription(workstation.getDescription());
			workstationUP.setBuilding(workstation.getBuilding());
			workstationUP.setMaxOccupants(workstation.getMaxOccupants());
			workstationUP.setType(workstation.getType());
			wr.save(workstationUP);
			return workstationUP;
		} else {
			throw new BookingException("Workstation non aggiornato");
		}

	}

	public void delete(long id) {
		wr.deleteById(id);
	}

}
