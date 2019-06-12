package com.example.Progetto;

import java.io.File;
import java.lang.reflect.*;
import java.util.ArrayList;
import com.example.Progetto.Gestione.*;

import org.springframework.web.bind.annotation.*;

/**
 * Classe Controllore per la gestione delle funzionalità Rest API fornite da Spring Boot
 * 
 */
@RestController
public class Controllore {

	/**
	   * Metodo che gestisce la richiesta GET di metadati
	   * 
	   * @return JSON di metadati dall'API su server
	   */
	@RequestMapping(value="/metadati", method=RequestMethod.GET)
	public ArrayList<BeanMetadati> RichestaMetadati(){
		return GestioneMetadati.LetturaMetadati(new File("file metadati.dat"));
	}
	
	
	 /**
	   * Metodo che gestisce la richiesta GET di dati
	   * 
	   * @param filter Filtro usato nella richiesta
	   * @param attributo Attributo su cui filtrare i dati
	   * @param val1 Valore di riferimento usato nel filtraggio
	   * @param val2 Valore di riferimento usato nel filtraggio (solo per $or)
	   * 
	   * @return JSON di dati dall'API su server
	   */
	@RequestMapping(value="/dati", method = RequestMethod.GET)
	public Object RichiestaDati(@RequestParam(value="filter", defaultValue = "vuoto")String filter, String attributo, String val1,@RequestParam(value="val2", defaultValue = "0") String val2){
		
		ArrayList<GareAppalti> lista = GestioneDati.LetturaBeans(new File("file beans.dat"));
		
		
		//Controllo di esistenza dell'attributo inserito
		ArrayList<BeanMetadati> meta = GestioneMetadati.LetturaMetadati(new File("file metadati.dat"));
		boolean[] checkAttributo = new boolean[meta.size()];
		
		for(int i=0; i<meta.size(); i++) {
			if(!attributo.equals(meta.get(i).getNome())) {
				checkAttributo[i] = true;
			}
			else {
				checkAttributo[i] = false;
			}
		}
		
		boolean isNotAttributo = true;
		for(int i=0; i<meta.size(); i++) {
			isNotAttributo &= checkAttributo[i];
		}
		
		if(isNotAttributo) {
			return "Attributo inserito non valido";
		}
		
		//Controllo di inserimento e validita' del filtro
		if(filter.equals("vuoto"))
			return lista;
		else {
			Filtro filtro = new Filtro(filter);
			
			if(!filtro.isExist())
				return "Filtro usato non esistente";
			
			ArrayList<GareAppalti> out = (ArrayList<GareAppalti>)filtro.Ricerca(attributo, val1, val2, lista);
			
			if(out.size() == 0)
				return "Nessun elemento corrisponde a questa richiesta";
			else
				return out;
		}
	}
	
	
	
	
	
	
	/**
	   * Metodo per la gestione della richieste di statistiche relative ad un attributo di tipo numerico o una stringa di caratteri
	   * 
	   * @param filter Filtro usato nella richiesta
	   * @param attributo Attributo che richiede l'utente
	   * @param val1 Valore di riferimento usato nel filtraggio
	   * @param val2 Valore di riferimento usato nel filtraggio (solo per $or)
	   * 
	   * @return JSON di statistiche su dati dall'API su server
	   * 
	   * @throws IllegalArgumentException
	   */
	@RequestMapping(value="/stats", method = RequestMethod.GET)
	public Object RichiestaStatistiche(@RequestParam(value="filter", defaultValue = "vuoto")String filter, String attributo, String val1, @RequestParam(value = "val2", defaultValue = "0")String val2){
		ArrayList<Object> listaAttributi = new ArrayList<Object>();
		try{
			Method m = GareAppalti.class.getMethod("get" + attributo.substring(0,1).toUpperCase() + attributo.substring(1));
			ArrayList<GareAppalti> beans = GestioneDati.LetturaBeans(new File("file beans.dat"));
			
			
			//Controllo di esistenza dell'attributo inserito
			ArrayList<BeanMetadati> meta = GestioneMetadati.LetturaMetadati(new File("file metadati.dat"));
			boolean[] checkAttributo = new boolean[meta.size()];
			
			for(int i=0; i<meta.size(); i++) {
				if(!attributo.equals(meta.get(i).getNome())) {
					checkAttributo[i] = true;
				}
				else {
					checkAttributo[i] = false;
				}
			}
			
			boolean isNotAttributo = true;
			for(int i=0; i<meta.size(); i++) {
				isNotAttributo &= checkAttributo[i];
			}
			
			if(isNotAttributo) {
				return "Attributo inserito non valido";
			}
			
			
			//Controllo di inserimento e validita' del filtro
			if(filter.equals("vuoto")) {
				for(GareAppalti obj : beans) {
					listaAttributi.add(m.invoke(obj));
				}
			}
			else {
				Filtro filtro = new Filtro(filter);
				
				if(!filtro.isExist())
					return "Filtro usato non esistente";
				
				ArrayList<GareAppalti> beansFiltrati = (ArrayList<GareAppalti>)filtro.Ricerca(attributo, val1, val2, beans);
				for(GareAppalti obj : beansFiltrati) {
					listaAttributi.add(m.invoke(obj));
				}
			}
		}
		catch(NoSuchMethodException e) {
			e.printStackTrace();
		}
		catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		catch(InvocationTargetException e) {
			e.printStackTrace();
		}
		
		if(listaAttributi.size() == 0)
			return "Nessun elemento corrisponde a questa richiesta";
			
		if(listaAttributi.get(0) instanceof String) {
			 ArrayList<String> vetStr = new ArrayList<String>();
			  for(Object obj : listaAttributi) {
				  String str = (String) obj;
				  vetStr.add(str);
			  }
			  return GestioneStatistiche.getStatsString(vetStr);
		  }
		else if(listaAttributi.get(0) instanceof Long) {
			
			ArrayList<Double> listaNumeri = new ArrayList<Double>();
			for(Object num : listaAttributi) {
				Long l =(Long)num;
				listaNumeri.add(l.doubleValue());
			}
			return new StatisticheNum(GestioneStatistiche.getAvg(listaNumeri),GestioneStatistiche.getMin(listaNumeri),
					GestioneStatistiche.getMax(listaNumeri),GestioneStatistiche.getDevStd(listaNumeri),
					GestioneStatistiche.getSum(listaNumeri),listaNumeri.size());	
		}
		else {
			ArrayList<Double> listaNumeri = new ArrayList<Double>();
			for(Object num : listaAttributi)
				listaNumeri.add((Double)num);
			
			return new StatisticheNum(GestioneStatistiche.getAvg(listaNumeri),GestioneStatistiche.getMin(listaNumeri),
									GestioneStatistiche.getMax(listaNumeri),GestioneStatistiche.getDevStd(listaNumeri),
									GestioneStatistiche.getSum(listaNumeri),listaNumeri.size());
		}
	}
}
