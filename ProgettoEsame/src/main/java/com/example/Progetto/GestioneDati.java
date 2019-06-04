package com.example.Progetto;


import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GestioneDati {
	
	
   public static ArrayList<String> getURLs(){
	   
	   ArrayList<String> lista = new ArrayList<String>();
	   
	   try {
		   
			JSONParser parser = new JSONParser();
			
			Reader read = new FileReader("JSONFileStarter.txt");
			
			JSONObject JObj1 = (JSONObject) parser.parse(read);
			JSONObject jObj2 = (JSONObject) JObj1.get("result");
			JSONArray jResources = (JSONArray) jObj2.get("resources");
			for(Object o : jResources) {
				JSONObject jobj3 = (JSONObject)o;
				String url = (String)jobj3.get("url");
				lista.add(url);
			}
				
			read.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ParseException e) {
           e.printStackTrace();
		}
	   
	   return lista;
	   
   }
   
   public static File getCSV(ArrayList<String> lista) {
	   
	   BufferedInputStream in = null;
	   int index = 0;
	   
	   File[] CSVs = new File[9];
	   
	   try {
		   long lenghtMax = 0;
		   // Assegna i file nell'array CSVs, e confornta le dimensioni dei singoli file trovando il più grande
		   for(int i = 0;i<8;i++) {   
			   File file = new File("file" + i + ".csv");
			   file.createNewFile();
			   CSVs[i] = file;
			   in = new BufferedInputStream(new URL(lista.get(i)).openStream());
			   Files.copy(in, file.toPath(),StandardCopyOption.REPLACE_EXISTING);
			   
	           if(file.length() > lenghtMax) {
	        	   lenghtMax = file.length();
	        	   index = i;
	           }
		   }
		   //Cancella i file contenuti nell'array CSVs
		   for(int i = 0;i<8;i++) {  
			   if(i != index)
				   CSVs[i].delete();
		   }
	   }catch(IOException e) {
		   e.printStackTrace();
	   }
	   //Ritorna un oggetto File con il file.csv più grande
	   return CSVs[index];    
   }
   
   public static ArrayList<GareAppalti> getBean(File file){
	   
	   char COMMA_DELIMITER = ',';                                //Delimitatore stringhe
	   
	   ArrayList<GareAppalti> data = new ArrayList<GareAppalti>();
	   BufferedReader br;
	   BufferedWriter bw;
	   File fw;
	   Scanner in;
	   try {
		   fw = new File("gay.csv");
		   fw.createNewFile();
		   br = new BufferedReader(new FileReader(file));
		   bw = new BufferedWriter(new FileWriter(fw));
		   in = new Scanner(br);
		   String line;
		   int index;
		   int dim;
		   int j;
		   int sup;
		   char[] stringaCar;
		   GareAppalti obj;
		   String attributi = in.nextLine();
		   ArrayList<String> values;
		   while(in.hasNext()) { //Line è la linea che contiene gli attributi che ci servono
			   line = in.nextLine();
			   index = 0;
			   values = new ArrayList<String>();
			   while(index < (line.length() - 1)) {
				   String vuoto = null;
				   String supporto;
				   dim = 0;
				   j = 0;
				   sup = 0;
				   if(line.charAt(index) == COMMA_DELIMITER) {
					   index++;
				   }
				   while((line.charAt(index) != COMMA_DELIMITER) && index < (line.length() -1)) {      //Index punterà alla posizione della virgola
					   index++;                                        //dim punterà,invece,alla dimensione della parola
					   dim++;
				   }
				   stringaCar = new char[dim];
				   if(dim==0) {
					   values.add(vuoto);
				   }else {
					   while(j<dim) {
						   sup = (index - dim)+j;
						   stringaCar[j] = line.charAt(sup);
						   j++;
					   }
					   supporto = new String(stringaCar);
					   values.add(supporto);
				   }
			   }
			   if(values.size() == 44) {    
				   for(int l = 0; l < 44;l++) {
					   if(values.get(l) == null ) {
						   values.set(l, "0");
					   }
				   }
				   obj = new GareAppalti(Long.parseLong(values.get(0)), Long.parseLong(values.get(1)),values.get(2),values.get(3),values.get(4),values.get(5),values.get(6), values.get(7),values.get(8),
					          values.get(9),values.get(10),values.get(11),values.get(12),values.get(13),values.get(14),values.get(15),values.get(16),values.get(17),values.get(18),values.get(19),values.get(20),values.get(21),
							  Double.parseDouble(values.get(22)),Long.parseLong(values.get(23)),Long.parseLong(values.get(24)),values.get(25),values.get(26),values.get(27),values.get(28),Long.parseLong(values.get(29))
							  ,values.get(30),values.get(31),values.get(32),values.get(33),values.get(34),values.get(35),Long.parseLong(values.get(36)),values.get(37),Long.parseLong(values.get(38)),values.get(39),values.get(40),values.get(41),values.get(42),values.get(43));  
				   data.add(obj);
				  
				   for(String s : values)
					   bw.write(s);
				   bw.write("\n\n");
			   }
			   
	      } 
		  in.close();	
		  bw.close();
	   }
	   catch(IOException e) {
		   e.printStackTrace();
	   }
	   
	   return data;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
