package com.pucp.Lab020252;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab020252Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab020252Application.class, args);
	}

}
package com.pucp.Lab020252;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab020252Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab020252Application.class, args);

		// Ejemplo extra: iteración simple
		System.out.println("=== Iteración de prueba al iniciar la aplicación ===");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Iteración número: " + i);
		}
		System.out.println("=== Fin de la iteración ===");
	}
}
