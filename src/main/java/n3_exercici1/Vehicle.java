package n3_exercici1;

public class Vehicle {

	private String type;

	public Vehicle(String type) {
	
		this.type = type;
	}
	
	public void  start() {
		System.out.println("The " + type + " has started");
	}
	
	
	public void accelerate() {
		System.out.println("The " + type + " is accelerating");
	}
	
	
	public void stop() {
		System.out.println("The " + type + " has stoped");
	}
}
