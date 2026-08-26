package in.co.corejava.oop.Abstraction;

public class Triangle extends Shape {

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub

	}
	
	public void area() {
		System.out.println("Area of Trigngle :" + (base * height/ 2));
		
	}

}
