package in.co.corejava.oop.Inheritance.Overriding;

public class TestShape {
	
	public static void main(String[] args) {
		
		System.out.println("--------Circle--------");
		
		Circle c = new Circle();
				
		c.setColor("red");
		c.setBorderWidth(2);
		c.setRadius(2);
		
		System.out.println(c.getColor());
		System.out.println(c.getBorderWidth());
		System.out.println(c.getRadius());
		c.area();
		
		
		System.out.println("--------Rectangle--------");
		
		Rectangle r = new Rectangle();
		
		
		r.setColor("Blue");
		r.setBorderWidth(2);
		r.setLength(4);
		r.setWidht(5);
		
		System.out.println(r.getColor());
		System.out.println(r.getBorderWidth());
		System.out.println(r.getLength());
		System.out.println(r.getWidht());
		c.area();
		
		System.out.println("--------Triangle--------");
		
		Triangle t = new Triangle();
		
		t.setColor("Black");
		t.setBorderWidth(2);
		t.setHeight(5);
		t.setBase(4);
		
		System.out.println(t.getColor());
		System.out.println(t.getBorderWidth());
		System.out.println(t.getHeight());
		System.out.println(t.getBase());
		c.area();
		
	}

}
