package com.example.Progetto.Gestione;


/**
 * Classe Bean per l'implementazione delle statistiche su stringhe di caratteri
 */
public class StatisticheStr {
	
    private String stringa;
    private int ripetizioni;

    public StatisticheStr(String stringa, int ripetizioni) {
		this.stringa = stringa;
		this.ripetizioni = ripetizioni;
	}

	public String getStringa() {
		return stringa;
	}

	public void setStringa(String stringa) {
		this.stringa= stringa;
	}

	public int getRipetizioni() {
		return ripetizioni;
	}

	public void setRipetizioni(int ripetizioni) {
		this.ripetizioni = ripetizioni;
	}

	@Override
	public String toString() {
		return "StatisticheStr [Stringa=" + stringa + ", ripetizioni=" + ripetizioni + "]";
	}


}