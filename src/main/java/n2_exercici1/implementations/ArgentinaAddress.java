package n2_exercici1.implementations;

import n2_exercici1.intermediate.IAddress;

public class ArgentinaAddress implements IAddress {

		private String country;
		private String zip;

		public ArgentinaAddress() {
			this.country = "Argentina";
			this.zip = "1000";
		}

		@Override
		public String showAddressFormat() {
			return country + " " + "(" +  zip + ")" ;
		}
}
