package Cycle;

public class Velo_electrique extends Velo {
	
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public Velo_electrique(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public Velo_electrique(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public Velo_electrique() {
		super();
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	} 
	
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public static double getDefautFacteurPuissanceMoteur() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public String toString() {
		return "Velo_electrique [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		FrequenceCoupsDePedale = super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
		return FrequenceCoupsDePedale;
	}
	
	public static void main(String[] args) {
		Velo_electrique v2 = new Velo_electrique(12.0, 5.0, 8.0);
		System.out.println(v2.getFacteurPuissanceMoteur());
		System.out.println(v2.toString());
	}
	
}
