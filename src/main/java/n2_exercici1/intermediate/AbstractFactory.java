package n2_exercici1.intermediate;

public interface AbstractFactory {

	IPhone getPhone(String phone);
	IAddress getAddress(String address);
	
}
