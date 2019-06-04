package com.example.Progetto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import java.io.*;
import java.util.*;


@SpringBootApplication
public class ProgettoEsameApplication {
	

	@Autowired
	public static void main(String[] args) throws org.json.simple.parser.ParseException {
		
		ArrayList<String> lista = GestioneDati.getURLs();
		File fileCSV = GestioneDati.getCSV(lista);
		ArrayList<GareAppalti> beans = GestioneDati.getBean(fileCSV);
		SpringApplication.run(ProgettoEsameApplication.class, args);
	}
	

}
