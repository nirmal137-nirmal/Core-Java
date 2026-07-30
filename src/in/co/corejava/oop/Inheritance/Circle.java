package in.co.corejava.oop.Inheritance;

public class Circle extends Shape {
	
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void area() {
		System.out.println("Area of Circle :" +(Math.PI * radius * radius));
	}

}
