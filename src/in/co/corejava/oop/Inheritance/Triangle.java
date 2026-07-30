package in.co.corejava.oop.Inheritance;

public class Triangle extends Shape {
	
	private int base;
	private int height;
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setHeight(int height) {
		this.height = height;
		
	}
	
	public int getHeight() {
		return height;
	}
	
	public void area() {
		System.out.println((base * height / 2.0)) ;
	}
	
	
	

}
