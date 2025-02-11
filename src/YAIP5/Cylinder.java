package YAIP5;

public class Cylinder {
	
	private Circle base;
	private double height;
	
	public Cylinder() {
		base = new Circle();
		height = 1.0;
	}
	
	public Cylinder(double radius, String color, double height) {
		this.base = new Circle(radius, color);
		this.height = height;
	}

	public Circle getBase() {
		return base;
	}

	public void setBase(Circle base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return base.getRadius();
	}
	
	public void setRadius(double radius) {
		base.setRadius(radius);
	}
	
	public String toString() {
		return "Cylinder [base=" + base + ", height=" + height + "]";
	}
	
	public static void main(String[] args) {
		
		Cylinder p1 = new Cylinder(4.5, "jaune", 5.2);
		Cylinder p2 = new Cylinder(6.2, "bleu", 5.5);
		System.out.println(p1);
		System.out.println(p2);
	}
	
	
}
