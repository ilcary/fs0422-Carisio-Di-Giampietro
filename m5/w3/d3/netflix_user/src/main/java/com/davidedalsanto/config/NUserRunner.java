package com.davidedalsanto.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import com.davidedalsanto.Service.NUserService;
import com.davidedalsanto.Service.RoleService;
import com.davidedalsanto.models.NUser;
import com.davidedalsanto.models.Role;

@Component
public class NUserRunner implements CommandLineRunner {
	
	@Autowired
	NUserService us;
	
	@Autowired
	RoleService rs;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(NUserConfig.class);

		rs.save(ctx.getBean("adminRole", Role.class));
		us.save(ctx.getBean("user1", NUser.class));

		((AbstractApplicationContext) ctx).close();		
	}

}
