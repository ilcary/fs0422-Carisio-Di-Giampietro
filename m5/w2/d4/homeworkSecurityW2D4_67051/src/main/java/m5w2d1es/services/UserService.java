package m5w2d1es.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import m5w2d1es.ExceptionControl.BookingException;
import m5w2d1es.Repositories.UserRepository;
import m5w2d1es.models.User;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;

	public Iterable<User> searchAllUsers() {
		return ur.findAll();
	}
	
	public Page<User> searchAllUsersPageable(Pageable p) {
		return ur.findAll(p);
	}

	public void create(User user) {
		ur.save(user);
	}

	public User findById(long id) {
		return ur.findById(id)
				.get();
	}

		public User update(Long id, User user) {
		Optional<User> userRes = ur.findById(id);

		if (userRes.isPresent()) {
			User userUp = userRes.get();
			userUp.setName(user.getName());
			userUp.setEmail(user.getEmail());
			ur.save(userUp);
			return userUp;
		} else {
			throw new BookingException("USer non aggiornato");
		}

	}
	
	
	public void delete(long id) {
		ur.deleteById(id);
	}
}
