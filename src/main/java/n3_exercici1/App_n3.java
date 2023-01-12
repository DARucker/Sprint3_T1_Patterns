package n3_exercici1;

public class App_n3 {

	/*
	 * Command
	 * 
	 * Diseña un parking de 4 vehículos: un coche, una bicicleta, un avión y un barco.
	 * 
	 * Muestra cómo funciona el patrón Command que implementa los métodos 
	 * arrancar, acelerar y frenar para cada tipo de vehículo.
	 */

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle("Car");
		Vehicle bike = new Vehicle("Bike");
		Vehicle airplane = new Vehicle("Airplane");
		Vehicle boat = new Vehicle("Boat");
		
		ImplStart start1 = new ImplStart(car);
		ImplAccelerate accelerate1 = new ImplAccelerate(car);
		ImplStop stop1 = new ImplStop(bike);
		ImplStart start2 = new ImplStart(bike);
		ImplStart start3 = new ImplStart(airplane);
		ImplStart start4 = new ImplStart(boat);
		ImplStart start5 = new ImplStart(airplane);
		ImplStop accelerate5 = new ImplStop(airplane);
		ImplStop stop5 = new ImplStop(airplane);

		
		Invoker invoker = new Invoker();
		invoker.reciveFunctions(start1);
		invoker.reciveFunctions(accelerate1);
		invoker.reciveFunctions(stop1);
		invoker.reciveFunctions(start2);
		invoker.reciveFunctions(start3);
		invoker.reciveFunctions(start4);
		invoker.reciveFunctions(start5);
		invoker.reciveFunctions(accelerate5);
		invoker.reciveFunctions(stop5);

		
		
		invoker.executeFunctions();
		
	}

	
	
	
}
