package YAIP4;

public class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		
		Animal p1 = new Animal("lola");
		Animal p2 = new Animal("tito");
		System.out.println(p1);
		System.out.println(p2);
	}
	
}
