package in.co.corejava.oop.Encapsulation;

public class Automobile {
	
	private String color;
	private int speed;
	private String make;
	
	//set color
	public void setColor(String color) {
		this.color = color;
	}
	
	//get color
	public String getColor() {
		return color;
	}
	
	//set color
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//get color
	public int getSpeed() {
		return speed;
		
	}
	
	//Set make
	public void setMake(String make) {
		this.make = make;
	}
	
	//get make
	public String getMake() {
		return make;
	}
	
	public void brake() {

		if (speed == 0) {
			System.out.println("car already stoped");
		} else {
			speed = speed - 10;
		}

	}

	public void accelerator() {

		if (speed == 400 || speed > 400) {
			System.out.println("speed limit is high please applay brake");
		} else {
			speed = speed + 10;
		}

	}

}
