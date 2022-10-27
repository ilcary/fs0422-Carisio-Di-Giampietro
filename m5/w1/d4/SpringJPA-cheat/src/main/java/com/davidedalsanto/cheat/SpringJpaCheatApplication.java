package com.davidedalsanto.cheat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.davidedalsanto.cheat.configs.OwnerConfig;
import com.davidedalsanto.cheat.entities.Address;
import com.davidedalsanto.cheat.entities.Car;
import com.davidedalsanto.cheat.entities.Engine;
import com.davidedalsanto.cheat.entities.Owner;
import com.davidedalsanto.cheat.services.OwnerService;

@SpringBootApplication
public class SpringJpaCheatApplication implements CommandLineRunner{
	
	@Autowired
	OwnerService os;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaCheatApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		saveOwner(configCarisio());
		
	}
	
	public void saveOwner(Owner o) {
		os.saveOwner(o);
	}
	
	public static Owner configCarisio() {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(OwnerConfig.class); 
				
		Owner carisio = ac.getBean("makeCarisio", Owner.class);
								
		((AbstractApplicationContext) ac).close();
		
		return carisio;
	}

}
