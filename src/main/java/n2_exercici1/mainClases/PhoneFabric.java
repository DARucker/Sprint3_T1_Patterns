package n2_exercici1.mainClases;

import n2_exercici1.implementations.ArgentinaPhone;
import n2_exercici1.implementations.SpainPhone;
import n2_exercici1.intermediate.AbstractFactory;
import n2_exercici1.intermediate.IAddress;
import n2_exercici1.intermediate.IPhone;

public class PhoneFabric implements AbstractFactory {

	@Override
	public IPhone getPhone(String phone) {

		if(phone == null) {
			System.out.println("no country data input");
		}
		
		if(phone.equalsIgnoreCase("Argentina")) {
			return new ArgentinaPhone();
		}else if(phone.equalsIgnoreCase("Spain")) {
			return new SpainPhone();
		}
		
		return null;
	}

	@Override
	public IAddress getAddress(String address) {
		return null;
	}

}
