package in.co.corejava.oop.Abstraction;

public class Rectangle extends Shape {

	private int length;
	private int weight;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub

	}
	
	public void area() {
		System.out.println("Area of Rectangle : " + (length * weight) );
	}

}
