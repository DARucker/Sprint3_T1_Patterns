package n2_exercici1.implementations;

import n2_exercici1.intermediate.IAddress;

public class SpainAddress implements IAddress {

	private String country;
	private String zip;

	public SpainAddress() {
		this.country = "Spain";
		this.zip = "08000";
	}

	@Override
	public String showAddressFormat() {
		return country + " " + "(" +  zip + ")" ;
	}
}
