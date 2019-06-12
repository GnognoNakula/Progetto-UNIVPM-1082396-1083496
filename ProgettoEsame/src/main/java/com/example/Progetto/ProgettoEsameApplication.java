package com.example.Progetto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Progetto.Gestione.*;



import java.io.*;
import java.util.*;


@SpringBootApplication
public class ProgettoEsameApplication {
	
	/**
	 * Metodo static "main" del programma
	 *
	 * @throws org.json.simple.parser.ParseException
	 */
	@Autowired
	public static void main(String[] args) throws org.json.simple.parser.ParseException {
		
		//Download del file
		ArrayList<String> lista = GestioneDati.getURLs();
		File fileCSV = GestioneDati.getCSV(lista);
		//Parsing dei dati presenti nel dataset e serializzazione in un file
		ArrayList<GareAppalti> beans = GestioneDati.getBean(fileCSV);
		File fileBeans = new File("file beans.dat");
		try{
			fileBeans.createNewFile();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		GestioneDati.SerializzazioneBeans(fileBeans, beans);	//Serializzazione dati
		
		
		//Ottenimento dei metadati e serializzazione in un file
		ArrayList<BeanMetadati> metaBeans = GestioneMetadati.getMeta();
		File fileMetadati = new File("file metadati.dat");
		try {
			fileMetadati.createNewFile();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		GestioneMetadati.SerializzazioneMetadati(fileMetadati, metaBeans);		//Serializzazione Metadati
		
		
		//Avvio di Spring
		SpringApplication.run(ProgettoEsameApplication.class, args);
		
	}
}
