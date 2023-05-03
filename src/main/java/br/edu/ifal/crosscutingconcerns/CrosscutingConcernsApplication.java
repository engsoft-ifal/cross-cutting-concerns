package br.edu.ifal.crosscutingconcerns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CrosscutingConcernsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrosscutingConcernsApplication.class, args);
	}

}
