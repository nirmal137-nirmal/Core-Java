package in.co.corejava.oop.Constructor;


public class Shape {
	
	public String color;
	public int borderWidth;
	
	public Shape() {
		System.out.println("This is Default Constructor");
	}
	
	public Shape(String color) {
		this();
		this.color = color;
		System.out.println(this.color);
	}
	
	public Shape(int borderWidth, String color ) {
		this(color);
		this.borderWidth = borderWidth;
		System.out.println(this.borderWidth);
	}

}
