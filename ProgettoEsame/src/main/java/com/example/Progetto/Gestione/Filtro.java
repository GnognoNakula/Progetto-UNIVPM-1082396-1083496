package com.example.Progetto.Gestione;

import java.lang.reflect.*;
import java.util.ArrayList;

/**
 * Classe che rappresenta l'oggetto Filtro e i suoi metodi principali
 * 
 *
 */
public class Filtro {
	
	private String tipoFiltro;

	public Filtro(String tipoFiltro) {
		this.tipoFiltro = tipoFiltro;
	}
	
	/**
	 * Metodo che attua un'azione di ricerca nella lista di input mandando in output una lista filtrata
	 * secondo il tipo di filtro, l'attributo e il valore di riferimento
	 * 
	 * @param attributo Attributo su cui filtrare i dati
	 * @param val1 Valore di riferimento usato nel filtraggio
	 * @param val2 Valore di riferimento usato nel filtraggio (solo per $or)
	 * @param listaIn Lista data in input su cui il metodo farà il filtraggio
	 * @return	Lista filtrata
	 */
	public Object Ricerca(String attributo, String val1, String val2, ArrayList<GareAppalti> listaIn){
		
		boolean isNumero = true;
		boolean isLong = true;
		boolean isDouble = true;
		ArrayList<GareAppalti> listaOut = new ArrayList<GareAppalti>();
		Method m;
		Double valNumDouble1 = null;
		Double valNumDouble2 = null;
		Long valNumLong1 = null;
		Long valNumLong2 = null;
		
		try {
			m = GareAppalti.class.getMethod("get" + attributo.substring(0,1).toUpperCase() + attributo.substring(1));
		}
		catch(NoSuchMethodException e) {
			e.printStackTrace();
			return "Attributo non esistente";
		}
		
		
		try {
			valNumDouble1 = Double.parseDouble(val1);
			valNumDouble2 = Double.parseDouble(val2);
		}
		catch(NumberFormatException e) {
			isDouble = false;
		}
		
		try {
			valNumLong1 = Long.parseLong(val1);
			valNumLong2 = Long.parseLong(val2);
		}
		catch(NumberFormatException e) {
			isLong = false;
		}
		
		if(isLong || isDouble)
			isNumero = true;
		else
			isNumero = false;
		
		
		
		if(tipoFiltro.equals("$eq")) {
			if(isNumero) {
				try {
					for(GareAppalti obj : listaIn) {
						if(m.invoke(obj) instanceof Double) {
							Double temp = (Double)m.invoke(obj);
							if(temp.equals(valNumDouble1)) {
								listaOut.add(obj);
							}
						}
						
						if(m.invoke(obj) instanceof Long) {
							Long temp = (Long)m.invoke(obj);
							if(temp.equals(valNumLong1)) {
								listaOut.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			else {
				try {
					for(GareAppalti obj : listaIn) {
						if(m.invoke(obj) instanceof String) {
							String temp = (String)m.invoke(obj);
							if(temp.equals(val1)) {
								listaOut.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		if(tipoFiltro.equals("$or")) {
			if(isNumero) {
				try {
					for(GareAppalti obj : listaIn) {
						if(m.invoke(obj) instanceof Double) {
							Double temp = (Double)m.invoke(obj);
							if(temp.equals(valNumDouble1) || temp.equals(valNumDouble2)) {
								listaOut.add(obj);
							}
						}
						
						if(m.invoke(obj) instanceof Long) {
							Long temp = (Long)m.invoke(obj);
							if(temp.equals(valNumLong1) || temp.equals(valNumLong2)) {
								listaOut.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			else {
				try {
					for(GareAppalti obj : listaIn) {
						if(m.invoke(obj) instanceof String) {
							String temp = (String)m.invoke(obj);
							if(temp.equals(val1) || temp.equals(val2)) {
								listaOut.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		if(tipoFiltro.equals("$not")) {
			if(isNumero) {
				try {
					for(GareAppalti obj : listaIn) {
						if(m.invoke(obj) instanceof Double) {
							Double temp = (Double)m.invoke(obj);
							if(!temp.equals(valNumDouble1)) {
								listaOut.add(obj);
							}
						}
						
						if(m.invoke(obj) instanceof Long) {
							Long temp = (Long)m.invoke(obj);
							if(!temp.equals(valNumLong1)) {
								listaOut.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			else {
				try {
					for(GareAppalti obj : listaIn) {
						if(m.invoke(obj) instanceof String) {
							String temp = (String)m.invoke(obj);
							if(!temp.equals(val1)) {
								listaOut.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		if(tipoFiltro.equals("$mag")) {
			if(isNumero) {
				try {
					for(GareAppalti obj : listaIn) {
						if(m.invoke(obj) instanceof Double) {
							Double temp = (Double)m.invoke(obj);
							if(temp.compareTo(valNumDouble1) > 0) {
								listaOut.add(obj);
							}
						}
						
						if(m.invoke(obj) instanceof Long) {
							Long temp = (Long)m.invoke(obj);
							if(temp.compareTo(valNumLong1) > 0) {
								listaOut.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		if(tipoFiltro.equals("$min")) {
			if(isNumero) {
				try {
					for(GareAppalti obj : listaIn) {
						if(m.invoke(obj) instanceof Double) {
							Double temp = (Double)m.invoke(obj);
							if(temp.compareTo(valNumDouble1) < 0) {
								listaOut.add(obj);
							}
						}
						
						if(m.invoke(obj) instanceof Long) {
							Long temp = (Long)m.invoke(obj);
							if(temp.compareTo(valNumLong1) < 0) {
								listaOut.add(obj);
							}
						}
					}
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
			
		return listaOut;
	}
	
	
	/**
	 * Metodo che segnala se tale filtro è stato effettivamente implementato nel programma
	 * 
	 * @return true se il tipo di filtro esiste, false se non esiste
	 */
	public boolean isExist() {
		
		if(tipoFiltro.equals("$not") || tipoFiltro.equals("$eq") || tipoFiltro.equals("$mag") || tipoFiltro.equals("$min") || tipoFiltro.equals("$or"))
			return true;
		else
			return false;
		
	}

}
