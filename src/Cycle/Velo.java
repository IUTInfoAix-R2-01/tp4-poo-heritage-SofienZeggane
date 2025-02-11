package Cycle;

import java.util.Random;

public class Velo {
	private static final double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;

	public double getBRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public Velo (double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo (double braquet) {
		this.braquet = braquet;
	}
	
	public Velo() {
		 this(DEFAUT_BRAQUET, 0);
	}

	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public String toString() {
		return "Velo [ braquet=" + braquet + ", diamRoue=" + diamRoue + ", genAlea=" + genAlea
				+ "]";
	}
	
	public double getPuissance (double FrequenceCoupsDePedale) {
		FrequenceCoupsDePedale = FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
		return FrequenceCoupsDePedale;
	}
	
}
