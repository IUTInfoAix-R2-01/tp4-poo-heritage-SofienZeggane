package YAIP4;

public class Dog extends Mammal{
	
	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Wooooof");
	}
	
	public String toString() {
		return super.toString();
	}
	
}
