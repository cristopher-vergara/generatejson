package com.returnjson.demo;

import com.returnjson.demo.dto.Commerce;
import com.returnjson.demo.service.ReturnJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.returnjson.demo.controllers",
											"com.returnjson.demo.dto",
                                            "com.returnjson.demo.service"})
public class ReturnjsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReturnjsonApplication.class, args);
	}


}
