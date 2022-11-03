package m5w2d1es;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import m5w2d1es.configs.ConfigurationBooking;
import m5w2d1es.models.Booking;
import m5w2d1es.models.Workstation;
import m5w2d1es.models.WorkstationType;
import m5w2d1es.services.BookingService;
import m5w2d1es.services.WorkstationService;
import m5w2d1es.utils.LogColor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BookingRunner implements CommandLineRunner {

	@Autowired
	BookingService bookingServ;

	@Autowired
	WorkstationService workstationServ;
	

	@Override
	public void run(String... args) throws Exception {
		log.info(LogColor.GREEN("START"));

//		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationBooking.class);
//		
//		bookingServ.create(ctx.getBean("newBooking1", Booking.class));
//		bookingServ.create(ctx.getBean("newBooking2", Booking.class));
//		bookingServ.create(ctx.getBean("newBooking3", Booking.class));
//		bookingServ.create(ctx.getBean("newBooking4", Booking.class));
//
//		List<Workstation> lw = workstationServ.searchWorkstation("Roma", WorkstationType.PRIVATE);
//		for (Workstation w : lw) {
//			System.out.println(w);
//		}
//
//		((AnnotationConfigApplicationContext) ctx).close();
//
//		log.info(LogColor.YELLOW("RUNNER END"));
	}

}
