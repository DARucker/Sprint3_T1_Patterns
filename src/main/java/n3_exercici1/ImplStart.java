package n3_exercici1;

public class ImplStart implements IFunction {

	private Vehicle vehicle;
	
	public ImplStart(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		
		vehicle.start();

	}

}
