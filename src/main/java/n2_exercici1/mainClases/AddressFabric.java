package n2_exercici1.mainClases;

import n2_exercici1.implementations.ArgentinaAddress;
import n2_exercici1.implementations.SpainAddress;
import n2_exercici1.intermediate.AbstractFactory;
import n2_exercici1.intermediate.IAddress;
import n2_exercici1.intermediate.IPhone;

public class AddressFabric implements AbstractFactory {

	@Override
	public IPhone getPhone(String phone) {
		return null;
	}

	@Override
	public IAddress getAddress(String address) {
		
		if(address == null) {
			System.out.println("no country data input");
		}
		if(address.equalsIgnoreCase("Argentina")) {
			return new ArgentinaAddress();
		}else if (address.equalsIgnoreCase("Spain")) {
			return new SpainAddress();
		}
		
		
		return null;
	}

}
