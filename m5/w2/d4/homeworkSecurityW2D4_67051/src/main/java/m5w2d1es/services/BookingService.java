package m5w2d1es.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import m5w2d1es.Repositories.BookingRepository;
import m5w2d1es.models.Booking;
import m5w2d1es.utils.LogColor;

@Service
public class BookingService {

	@Autowired
	private BookingRepository br;

	public Iterable<Booking> searchAllBookings() {
		return br.findAll();
	}
	
	public Page<Booking> searchAllBookingsPage(Pageable p) {
		return br.findAll(p);
	}

	public void create(Booking booking) throws Exception {

		try {
		
		if (br.getByUserAndValidity(booking.getUser().getId(), booking.getValidity()).size() == 0) {

			if (br.getByWorkstationAndValidity(booking.getWorkstation().getId(), booking.getValidity())
					.size() < booking.getWorkstation().getMaxOccupants()) {

				br.save(booking);
			} else {
				throw new Exception(booking.getWorkstation() + " in data " + booking.getValidity() + " è al completo");
			}

		} else {
			throw new Exception(
					booking.getUser() + " ha già prenotato una postazione in data: " + booking.getValidity());
		}
		
		}catch (Exception e) {
			LogColor.errorMessage(e.getMessage());
		}
	}

	public Booking findById(long id) {
		return br.findById(id).get();
	}

	public List<Booking> findByUserAndValidity(long userId, LocalDate time) {
		return br.getByUserAndValidity(userId, time);
	}

	public List<Booking> findByWorkstationAndValidity(long workstationId, LocalDate time) {
		return br.getByUserAndValidity(workstationId, time);
	}

	public void delete(long id) {
		br.deleteById(id);
	}

}
