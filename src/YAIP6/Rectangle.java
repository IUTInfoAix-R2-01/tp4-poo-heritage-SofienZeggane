package YAIP6;

public class Rectangle {
	
	private double width;
	private double lenght;
	
	public Rectangle(double width, double lenght) {
		this.width = width;
		this.lenght = lenght;
	}

	public String toString() {
		return "Rectangle [width=" + width + ", lenght=" + lenght + "]";
	}
	
	public double getArea() {
		return lenght * width;
	}
	
	public double getPerimeter() {
		return (lenght + width) * 2;
	}
	
}
