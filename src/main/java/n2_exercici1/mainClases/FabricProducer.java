package n2_exercici1.mainClases;

import n2_exercici1.intermediate.AbstractFactory;

public class FabricProducer {

	public static AbstractFactory getFactory(String type) {
		if (type.equalsIgnoreCase("phone")) {
			return new PhoneFabric();
		} else if (type.equalsIgnoreCase("address")) {
			return new AddressFabric();
		}
		return null;
	}
}
