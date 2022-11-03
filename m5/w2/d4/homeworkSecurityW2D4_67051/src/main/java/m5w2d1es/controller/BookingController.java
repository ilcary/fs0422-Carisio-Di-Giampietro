package m5w2d1es.controller;

import java.time.LocalDate;
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
import m5w2d1es.models.Booking;
import m5w2d1es.services.BookingService;

@RestController
@RequestMapping("/api/bookings")
@Slf4j
public class BookingController {

	@Autowired
	private BookingService bs;

	@GetMapping("")
	public Iterable<Booking> searchAllBookings() {
		return bs.searchAllBookings();
	}
	
	@GetMapping("/pageable")
	public ResponseEntity<Page<Booking>> findAll(Pageable p) {
		Page<Booking> findAll = bs.searchAllBookingsPage(p);

		if (findAll.hasContent()) {
			return new ResponseEntity<>(findAll, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/searchByUserAndValidity")
	public List<Booking> searchByUserAndValidity(@RequestParam Long id, @RequestParam LocalDate validity) {
		return bs.findByUserAndValidity(id, validity);
	}

	@PostMapping("")
	public void create(@RequestBody Booking booking) {
		try {
			bs.create(booking);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@GetMapping("/{id}")
	public Booking readById(@PathVariable Long id) {
		return bs.findById(id);
	}

	@PutMapping("")
	public void update(@RequestBody Booking booking) {
		try {
			bs.create(booking);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		try {
			bs.delete(id);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

}
