package in.co.corejava.oop.Inheritance;

public class TestShape {
	
	public static void main(String[] args) {
		
		System.out.println("------Circle-------");
		
		Circle c  = new Circle();
		
		c.setRadius(2);
		c.setColor("Red");
		c.setBorderWidth(1);
		
		System.out.println("length : " + c.getRadius());
		System.out.println("color : " + c.getColor());
		System.out.println("Border Width : " + c.getBorderWidth());
		c.area();
		
		
		System.out.println("------Rectangle------");
		
		Rectangle r = new Rectangle();
		
		r.setLength(5);
		r.setWidth(10);
		r.setColor("Blue");
		r.setBorderWidth(3);
		
		System.out.println("Length : " + r.getLength() );
		System.out.println("Width : " + r.getWidth());
		System.out.println("Color : " + r.getColor());
		System.out.println("Border Width : " + r.getBorderWidth());
		r.area();
		
		System.out.println("-------Triangle--------");
		
		Triangle t = new Triangle();
		
		t.setBase(2);
		t.setHeight(2);
		t.setColor("Green");
		t.setBorderWidth(1);
		
		System.out.println("Base : " + t.getBase());
		System.out.println("Height : " + t.getHeight());
		System.out.println("Color : " + t.getColor());
		System.out.println("Border Width : " + t.getBorderWidth());
		r.area();
	}

}
