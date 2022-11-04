package com.example.GestioneDispositivi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.example.GestioneDispositivi.Config.Config1;
import com.example.GestioneDispositivi.Models.Device;
import com.example.GestioneDispositivi.Models.Role;
import com.example.GestioneDispositivi.Models.User;
import com.example.GestioneDispositivi.Service.DeviceService;
import com.example.GestioneDispositivi.Service.RoleService;
import com.example.GestioneDispositivi.Service.UserService;

@Component
public class GesstioneDispositiviRunnetty implements CommandLineRunner {
	
	@Autowired
	UserService us;
	
	@Autowired
	DeviceService ds;
	
	@Autowired
	RoleService rs;

	@Override
	public void run(String... args) throws Exception {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config1.class);
		
//		us.create(ctx.getBean("b1", User.class));
//		us.create(ctx.getBean("b2", User.class));
//		ds.create(ctx.getBean("b3", Device.class));
//		ds.create(ctx.getBean("b4", Device.class));
//		ds.create(ctx.getBean("b5", Device.class));
//		rs.create(ctx.getBean("b6", Role.class));
//		rs.create(ctx.getBean("b7", Role.class));
		
		
		((AnnotationConfigApplicationContext) ctx).close();
		
	}

}
