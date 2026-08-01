package in.co.corejava.oop.Overriding;

public class TetsEmployee {

	public static void main(String[] args) {
		
		
		Employee e1 = new Developer();
        Employee e2 = new Tester();
        Employee e3 = new Manager();

        e1.work();
        e2.work();
        e3.work();
		
	}

}
