package com.example.Progetto.Gestione;

/**
 *  Classe Bean utilizzata per l'implementazione delle statistiche numeriche
 */
public class StatisticheNum {
	
	double avg;
	double min;
	double max;
	double devStd;
	double sum;
	int count;
	
	
	public StatisticheNum(double avg, double min, double max, double devStd, double sum, int count) {
		this.avg = avg;
		this.min = min;
		this.max = max;
		this.devStd = devStd;
		this.sum = sum;
		this.count = count;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public double getMin() {
		return min;
	}


	public void setMin(double min) {
		this.min = min;
	}


	public double getMax() {
		return max;
	}


	public void setMax(double max) {
		this.max = max;
	}


	public double getDevStd() {
		return devStd;
	}


	public void setDevStd(double devStd) {
		this.devStd = devStd;
	}


	public double getSum() {
		return sum;
	}


	public void setSum(double sum) {
		this.sum = sum;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Statistiche [avg=" + avg + ", min=" + min + ", max=" + max + ", devStd=" + devStd + ", sum=" + sum
				+ ", count=" + count + "]";
	}
}
