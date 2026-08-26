package in.co.corejava.oop.Abstraction;

public class Circle  extends Shape{
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
	public void area() {
		System.out.println("Circle Area : " + Math.PI * radius * radius);
	}
	
	

}
