package n2_exercici1.implementations;

import n2_exercici1.intermediate.IAddress;

public class SpainAddress implements IAddress {

	private String country;
	private String zip;
	private String continent;
	


	public SpainAddress() {
		this.country = "Spain";
		this.zip = "08000";
		this.continent = "Europe";
	}

	@Override
	public String showAddressFormat() {
		return continent + " " + country + " " + zip ;
	}
}
