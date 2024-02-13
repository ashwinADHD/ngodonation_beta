package com.ashwin.ngobeta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
/*@EntityScan("com.ashwin.ngobeta")*/
public class NgobetaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NgobetaApplication.class, args);
	}

}
