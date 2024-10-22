package dev.start.FitnessApp;

import dev.start.FitnessApp.Controller.Welcome;
import dev.start.FitnessApp.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//import static com.sun.tools.javac.tree.TreeInfo.args;

@SpringBootApplication
public class FitnessAppApplication {

	private static final Logger log = LoggerFactory.getLogger(FitnessAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FitnessAppApplication.class, args);

		//System.out.println(" Hay There , Application started Successfully ");


	}

}
