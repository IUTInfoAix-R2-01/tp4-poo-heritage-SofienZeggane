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
	
}
