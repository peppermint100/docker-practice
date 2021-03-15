package com.peppermint100.dockerpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerpracticeApplication {

	@GetMapping("/")
	public String hello(){
	    return "Hello Docker!! jar file gradle";
    }

	public static void main(String[] args) {
		SpringApplication.run(DockerpracticeApplication.class, args);
	}

}
