package com.andrew.andrew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AndrewApplication {

	@RequestMapping("/")
	public String home() {
		int a = 11;
		int b = 18;
		int data1 = 1;
		data1 = data.datam(a,b);
		String str = "Кількість "+Integer.toString(data1);
		return str;
	}
	public static void main(String[] args) {
		SpringApplication.run(AndrewApplication.class, args);
	}

}
