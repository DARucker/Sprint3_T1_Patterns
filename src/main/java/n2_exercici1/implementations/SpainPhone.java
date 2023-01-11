package n2_exercici1.implementations;

import n2_exercici1.intermediate.IPhone;

public class SpainPhone implements IPhone {

	private String longDistance;
	private String mobile;
	private String prefix;
	
	public SpainPhone() {
	
		this.longDistance = "+34";
		this.mobile = "";
		this.prefix = "";
	}

	@Override
	public String showPhoneFormat() {
		return "(" + longDistance + mobile + prefix + ") ";
	}
	
}
