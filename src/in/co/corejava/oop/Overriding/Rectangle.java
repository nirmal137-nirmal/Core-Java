package in.co.corejava.oop.Overriding;

public class Rectangle extends Shape {
	
	private int length;
	private int widht;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidht() {
		return widht;
	}
	public void setWidht(int widht) {
		this.widht = widht;
	}
	
	@Override
	public void area() {
		System.out.println("area of rectangle: " + (length * widht));
	}
	

}
