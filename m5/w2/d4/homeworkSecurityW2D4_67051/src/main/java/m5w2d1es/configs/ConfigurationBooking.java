package m5w2d1es.configs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import m5w2d1es.models.Booking;
import m5w2d1es.models.Building;
import m5w2d1es.models.User;
import m5w2d1es.models.Workstation;
import m5w2d1es.models.WorkstationType;

@Configuration
public class ConfigurationBooking {
	
	@Bean(name = "b1")
	@Scope("singleton")
	public Building newBuilding1() {
		return new Building("Epicode", "Via dei Magazzini Generali, 16", "Roma");
	}

	@Bean(name = "b2")
	@Scope("singleton")
	public Building newBuilding2() {
		return new Building("Deloitte", "Via Tortona, 25", "Milano");
	}

	@Bean(name = "ws1")
	@Scope("singleton")
	public Workstation newWorkstation1() {
		Workstation w = new Workstation("Cubicolo", WorkstationType.PRIVATE, 1);
		w.setBuilding(newBuilding1());
		return w;
	}

	@Bean(name = "ws2")
	@Scope("singleton")
	public Workstation newWorkstation2() {
		Workstation w = new Workstation("La grande vetrata (Serra)", WorkstationType.MEETING_ROOM, 50);
		w.setBuilding(newBuilding1());
		return w;
	}

	@Bean(name = "ws3")
	@Scope("singleton")
	public Workstation newWorkstation3() {
		Workstation w = new Workstation("Loft", WorkstationType.OPENSPACE, 25);
		w.setBuilding(newBuilding2());
		return w;
	}

	@Bean(name = "ws4")
	@Scope("singleton")
	public Workstation newWorkstation4() {
		Workstation w = new Workstation("Solarium", WorkstationType.OPENSPACE, 15);
		w.setBuilding(newBuilding2());
		return w;
	}

	@Bean(name = "u1")
	@Scope("singleton")
	public User newUser1() {
		return new User("user1", "Dante", "dante@gmail.com");
	}

	@Bean(name = "u2")
	@Scope("singleton")
	public User newUser2() {
		return new User("user2", "Virgilio", "virgilio@gmail.com");
	}

	@Bean
	@Scope("singleton")
	public Booking newBooking1() {
		return new Booking(LocalDate.now(), newWorkstation1(), newUser1());
	}

	@Bean
	@Scope("singleton")
	public Booking newBooking2() {
		return new Booking(LocalDate.now(), newWorkstation2(), newUser1());
	}

	@Bean
	@Scope("singleton")
	public Booking newBooking3() {
		return new Booking(LocalDate.now(), newWorkstation1(), newUser2());
	}

	@Bean
	@Scope("singleton")
	public Booking newBooking4() {
		return new Booking(LocalDate.now(), newWorkstation3(), newUser2());
	}
}
