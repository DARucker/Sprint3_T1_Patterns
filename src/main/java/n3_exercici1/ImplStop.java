package n3_exercici1;

public class ImplStop implements IFunction {

	private Vehicle vehicle;
	
	public ImplStop(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {	
		vehicle.stop();
	}

}
