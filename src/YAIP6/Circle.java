package YAIP6;

public class Circle implements GeometricObject{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double Radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		return 2 * radius;
	}
	
}
