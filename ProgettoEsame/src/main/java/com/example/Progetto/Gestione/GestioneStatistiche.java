package com.example.Progetto.Gestione;

import java.util.ArrayList;
/**
 *  Classe che contiene i metodi per la gestione delle statistiche sugli attributi
 */
public class GestioneStatistiche {

   /**
    * Metodo che calcola il valore medio dei valori nell'arraylist "lista"
    * 
    * @param lista ArrayList di double relativi all'attributo
    * @return il valore medio
    */
   public static double getAvg(ArrayList<Double> lista) {
	   double avg;
	   avg = (getSum(lista)/lista.size());
	   return avg;
   }

   /**
    * Metodo che trova il valore minimo nei valori nell'arraylist "lista"
    * 
    * @param lista ArrayList di double relativi all'attributo
    * @return il valore minimo
    */
   public static double getMin(ArrayList<Double> lista) {
	   double min = lista.get(0);
	   for(int i = 0;i<lista.size();i++) {
		   if(min > lista.get(i)) {
			   min = lista.get(i);
		   }
	   }
	   return min;
   }

   /**
    * Metodo che trova il valore Massimo nei valori nell'arraylist "lista"
    * 
    * @param lista ArrayList di double relativi all'attributo
    * @return il valore massimo
    */
   public static double getMax(ArrayList<Double> lista) {
	   double max = lista.get(0);
	   for(int i = 0;i<lista.size();i++) {
		   if(max < lista.get(i)) {
			   max = lista.get(i);
		   }

	   }
	   return max;
   }

   /**
    * Metodo che calcola la Deviazione Standard dei valori nell'arraylist "lista"
    * 
    * @param lista ArrayList di double relativi all'attributo
    * @return la deviazione standard
    */
   public static double getDevStd(ArrayList<Double> lista) {
	   double avg = getAvg(lista);
	   double sumScarti = 0;
	   for(double num : lista) {
		   sumScarti += Math.pow(avg-num, 2);
	   }
	   double devStd = Math.sqrt(sumScarti);
	   return devStd;
   }

   /**
    * Metodo che calcola la sommatoria totale dei valori nell'arraylist "lista"
    * 
    * @param lista ArrayList di double relativi all'attributo
    * @return la sommatoria totale
    */
   public static double getSum(ArrayList<Double> lista) {
	   double sum = 0;
	   for(double num : lista)
		   sum += num;
	   return sum;
   }

   

   /**
    * Metodo che si occupa del calcolo delle statistiche relative alle stringhe
    * 
    * @param strings Lista di stringhe relative all'attributo
    * @return un ArrayList di oggetti StatisticheStr[stringa e suo numero di ripetizioni]
    */
	public static ArrayList<StatisticheStr> getStatsString(ArrayList<String> strings){
	  ArrayList<StatisticheStr> stats = new  ArrayList<StatisticheStr>();
	  String stringa;
	  int ricorrSupport;
	  StatisticheStr support;
	  Boolean presente;
	  for(int i = 0;i < strings.size();i++){
		presente = false;
		stringa = strings.get(i);
        ricorrSupport = 1;
	    for(int j = 0;j < stats.size() && !presente;j++){
	      if(stringa.equals(stats.get(j).getStringa())){
	        presente = true;
	        ricorrSupport = stats.get(j).getRipetizioni() + 1;
	        support = new StatisticheStr(stringa,ricorrSupport);
	        stats.set(j, support);
	       }
	    }
	    if(!presente) {
	    	support = new StatisticheStr(stringa,ricorrSupport);
	    	stats.add(support);
	    }
	  }
	  return stats;
	}
}