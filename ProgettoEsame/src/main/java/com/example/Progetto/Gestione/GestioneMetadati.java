package com.example.Progetto.Gestione;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.*;

/**
 *  Classe che si occupa della gestione dei metadati, partendo dal parsing fino alla serializzazione
 */
public class GestioneMetadati {
	
	/**
     * Metodo che si occupa del parsing dei metadati dei singoli attributi della classe GareAppalti
     * 
     * @return ArrayList di oggetti di tipo BeanMetadati
     */
	public static ArrayList<BeanMetadati> getMeta(){
			
		ArrayList<BeanMetadati> listaMetadati = new ArrayList<BeanMetadati>();
			
		Class<?> c = GareAppalti.class;
		Field[] attributi = c.getDeclaredFields();
			
		for(int i=0; i<attributi.length; i++) {
			Metadati annotazione = attributi[i].getAnnotation(Metadati.class);
			listaMetadati.add(new BeanMetadati(annotazione.nome(),annotazione.tipo()));
		}
				
		return listaMetadati;
	}
		
	
	
	/**
	  * Metodo che si occupa della serializzazione degli oggetti BeanMetadati
	  *
	  * @param file File dove serializzare gli oggetti BeanMetadati[file creato nel main]
	  * @param meta L'ArrayList di oggetti BeanMetadati[Fornito dal metodo getMeta()]
	  */
	public static void SerializzazioneMetadati(File file, ArrayList<BeanMetadati> meta) {
			   
		   try {
				   
			   ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			   
			   out.writeObject(meta);
			   out.close();
		  }
		  catch(IOException e) {
			  System.out.println("Errore di I/O");
			  e.printStackTrace();
			   }
		   }
		
	
	
	/**
	  * Metodo che si occupa dell'estrabolazione da file dei BeanMetadati
	  * 
	  * @param file File da cui estrabolare gli oggetti BeanMetadati
	  * @return un ArrayList di BeanMetadati
	  */
	public static ArrayList<BeanMetadati> LetturaMetadati(File file){
		
		ArrayList<BeanMetadati> lista = new ArrayList<BeanMetadati>();   
		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			lista = (ArrayList<BeanMetadati>)in.readObject();
			in.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Lista non trovata");
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("Errore di I/O");
			e.printStackTrace();
		}
		return lista;
	}
}
