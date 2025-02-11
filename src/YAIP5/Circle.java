package YAIP5;

public class Circle {
	
	private double radius;
	private String color;
	   
	// Constructors (overloaded)
	/** Constructs a Circle instance with default value for radius and color */
	public Circle() {  // 1st (default) constructor
	   this.radius = 1.0;
	   this.color = "red";
	}
	   
	/** Constructs a Circle instance with the given radius and default color */
	public Circle(double r) {  // 2nd constructor
	   this.radius = r;
	   this.color = "red";
	}
	public Circle(double r, String c) {  //3rd constructor
		this.radius = r;
		this.color = c;
	}
	   
	/** Returns the radius */
	public double getRadius() {
	  return radius; 
	}
	   
	/** Returns the area of this Circle instance */
	public double getArea() {
	   return radius*radius*Math.PI;
	}
	   
	public String getColor() {
		return color; 
	}
	   
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	   
	public void setColor(String newColor) {
		this.color = newColor;
	}
	   
	public String toString() {
		return "Circle[radius= " + radius + "color = " + color + "]";
	}
}
