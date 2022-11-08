package Banca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Banca.entity.User;
import Banca.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User save(User x) {
		return repository.save(x);
	}

	public List<User> getAll() {
		return repository.findAll();
	}

	public User getById(Long id) throws Exception {
		Optional<User> user = repository.findById(id);
		if (!user.isPresent())
			throw new Exception("User not available");
		return user.get();
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	public User findByName(String name) throws Exception {
		Optional<User> user = repository.findByUsername(name);
		if (!user.isPresent())
			throw new Exception("No user with that name found");
		return user.get();
	}
}