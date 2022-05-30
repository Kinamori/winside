package com.example.winside;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WinsideApplication {

	public static void main(String[] args) {
		//SpringApplication.run(WinsideApplication.class, args);
		Grille g = new Grille("/home/jeremy/input.tsv");
		System.out.println(g.nbrPointZone(6.5, -7));
	}

}
