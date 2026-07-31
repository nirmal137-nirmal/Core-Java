package in.co.corejava.oop.Inheritance;

public class TestVehicle {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------");
		
		Car c = new Car();
		
		c.setVihicleName("BMW");
		c.setVihicleNumber("bmw450450car");
		c.setFueltype("Petrol");
		c.setPrice(5800000.20);
		c.setColor("Black");
		c.setSeatingCapacity(5);
		c.setTransmission("Automatic");
		c.setAirConditioner("Yes");
		
		System.out.println("Vihicle Name :" +c.getVihicleName());
		System.out.println("Vihicle Number :" +c.getVihicleNumber());
		System.out.println("Fuel Type : " +c.getFueltype());
		System.out.println("Price : " +c.getPrice());
		System.out.println("Color : " +c.getColor());
		System.out.println("Seating Capacity :"+c.getSeatingCapacity());
		System.out.println("Transmission :" +c.getTransmission());
		System.out.println("Air Conditioner :" +c.getAirConditioner());
		
		
		System.out.println();
		System.out.println("----------------------------------------------");
		
		Bike b = new Bike();
		
		b.setVihicleName("Royal Enfield");
		b.setVihicleNumber("RoYal450450FiEd");
		b.setFueltype("Petrol");
		b.setPrice(250000.00);
		b.setColor("White & Black");
		b.setEngineCC(250);
		b.setDiscBrake("yes");
		b.setHelmetType("Full-Face Helmet");
		
		System.out.println("Vihicle Name :" +b.getVihicleName());
		System.out.println("Vihicle Number :" +b.getVihicleNumber());
		System.out.println("Fuel Type : " +b.getFueltype());
		System.out.println("Price : " +b.getPrice());
		System.out.println("Color : " +b.getColor());
		System.out.println("Engine CC : " +b.getEngineCC());
		System.out.println("Helmet Type : " +b.getHelmetType());
		
		System.out.println();
		System.out.println("----------------------------------------------");
		
		Bus s = new Bus();
		
		s.setVihicleName("Indore Express");
		s.setVihicleNumber("MP09AB1234");
		s.setFueltype("Petrol");
		s.setPrice(2500000.00);
		s.setColor("Blue");
		s.setTotalSeats(52);
		s.setBusType("Sleeper");
		
		
		
		System.out.println("Vihicle Name :" +s.getVihicleName());
		System.out.println("Vihicle Number :" +s.getVihicleNumber());
		System.out.println("Fuel Type : " +s.getFueltype());
		System.out.println("Price : " +s.getPrice());
		System.out.println("Color : " +s.getColor());
		System.out.println("Total Seats :" +s.getTotalSeats());
		System.out.println("Bus Type :" +s.getBusType());
		
		
		
		
		
	}

}
