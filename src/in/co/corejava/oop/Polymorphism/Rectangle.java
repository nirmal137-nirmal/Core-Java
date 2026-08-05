package in.co.corejava.oop.Polymorphism;

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
		this.widht =  widht;
		
	}
	
	@Override
	public double area() {
		return length * widht;
	}
	
	

}
