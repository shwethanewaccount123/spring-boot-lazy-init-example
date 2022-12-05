package com.techprimers.lazy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Comaponent(basepPackage={"com.techprimers.lazy.controller"})
public class SpringBootLazyInitExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLazyInitExampleApplication.class, args);
	}

}
