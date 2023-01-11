package n2_exercici1.implementations;

import n2_exercici1.intermediate.IPhone;

public class ArgentinaPhone implements IPhone {

	private String longDistance;
	private String mobile;
	private String prefix;
	
	public ArgentinaPhone() {
	
		this.longDistance = "+54";
		this.mobile = " 9";
		this.prefix = " 11";
	}

	@Override
	public String showPhoneFormat() {
		return "(" + longDistance + mobile + prefix + ") ";
	}
	
	
}
