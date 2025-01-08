package dev.project.bookShow;

import dev.project.bookShow.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookShowApplication implements CommandLineRunner {

	@Autowired
	private InitService initService;

	public static void main(String[] args) {
		SpringApplication.run(BookShowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting the Data initialisation");
		initService.initialise();
	}
}
