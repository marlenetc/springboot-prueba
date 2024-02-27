package com.example.Java.Spring.Boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class P1holamundoApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(P1holamundoApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(P1holamundoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*System.out.println("Hola mundo!!! Soy Marlene TC en consola");*/
		log.info("Hola mundo!!! Soy Marlene");
	}
}