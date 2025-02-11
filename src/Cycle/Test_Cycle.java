package Cycle;

public class Test_Cycle {

	public static void main(String[] args) {
		Velo v1 = new Velo();
		System.out.println(v1.getBraquet());
		System.out.println(v1.toString());
		Velo_electrique v2 = new Velo_electrique(12.0, 5.0, 8.0);
		System.out.println(v2.getFacteurPuissanceMoteur());
		System.out.println(v2.toString());
	}

}
