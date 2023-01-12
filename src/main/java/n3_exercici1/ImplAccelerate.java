package n3_exercici1;

public class ImplAccelerate implements IFunction {

	private Vehicle vehicle;
	
	public ImplAccelerate(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.accelerate();
	}

}
