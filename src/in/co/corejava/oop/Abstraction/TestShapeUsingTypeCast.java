package in.co.corejava.oop.Abstraction;

public class TestShapeUsingTypeCast {

	public static void main(String[] args) {

		Shape s1 = new Circle();

		System.out.println("--------Circle------");

		// Type Casting
		Circle c = (Circle) s1;

		c.setRadius(2);
		System.out.println(c.getRadius());
		c.area();

		System.out.println("---------Rectangle-------");

		Shape s2 = new Rectangle();

		//Type Casting
		Rectangle r = (Rectangle) s2;
		
		r.setLength(4);
		r.setWeight(5);
		System.out.println(r.getLength());
		System.out.println(r.getWeight());
		r.area();
		
		
		System.out.println("-----Triangle---------");
		
		Shape s3 = new Triangle();
		
		//Type Casting 
		Triangle t = (Triangle)s3;
		t.setBase(2);
		t.setHeight(3);
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		t.area();
		
		
		

	}

}
