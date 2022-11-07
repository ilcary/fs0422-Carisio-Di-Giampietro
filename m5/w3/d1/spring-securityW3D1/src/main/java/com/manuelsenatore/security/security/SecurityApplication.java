package com.manuelsenatore.security.security;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SecurityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		textConvertion("ciao");
		int[] nums = new int[] {1, 2, 3};
		Arrays.stream(nums).forEach(n -> System.out.println(n));
		List<Integer> l = Stream.of(1, 2, 3, 4, 5)
				.filter(n -> n%2!=0)
				.map(n -> n*10)
				.collect(Collectors.toList());
		//Stream.of(nums).forEach(n -> Arrays.stream(n).forEach(System.out::println));
		
		System.out.println(l);
	}
	
	public static void textConvertion(String attribute) {
		String s = "EPICODE";
		String vowels = "aeiou";
		for(int i = 0; i < attribute.length(); i++) {
			if(vowels.contains((attribute.charAt(i) + "").toLowerCase())) {
				s += (char) (attribute.charAt(i) + 3) + "";
			}else {
				s += (char) (attribute.charAt(i) - 3) + "";
			}
		}
		System.out.println(s);
	}
}

