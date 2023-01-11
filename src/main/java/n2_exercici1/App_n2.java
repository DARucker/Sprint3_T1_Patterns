package n2_exercici1;

import n2_exercici1.intermediate.AbstractFactory;
import n2_exercici1.intermediate.IAddress;
import n2_exercici1.intermediate.IPhone;
import n2_exercici1.mainClases.FabricProducer;

public class App_n2 {


	/*
	 * Abstract Factory
	 * 
	 * Crea un pequeno gestor de direcciones y numeros de telefono internacionales.
	 * 
	 * La aplicacion debe permitir a�adir a la agenda, direcciones y números de 
	 * telefono internacionales. Teniendo en cuenta los distintos formatos de los 
	 * distintos paises, construye la agenda, las direcciones y los teléfonos 
	 * implementando un patron Abstract Factory.
	 * 
	 */
	
	public static void main(String[] args) {
		
	AbstractFactory abstractFactory = FabricProducer.getFactory("phone");	
	IPhone iphone1 = abstractFactory.getPhone("Argentina");

	AbstractFactory abstractFactory1 = FabricProducer.getFactory("address");	
	IAddress iAddress = abstractFactory1.getAddress("Argentina");
			
		String name = "Lionel Messi";
		String address = "Rosario";
		String country = "Argentina";
		String phone = "4321-1234";
		System.out.println("Data: " + name  + ", " + address  + ", " + phone);
		System.out.println("Message: convenrt zip and area phone before insert into Directory: " +"\n");
		System.out.println("In process..." +"\n");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	System.out.println("Inserting data: " +"\n");	
	System.out.println(name + ", " + address  + ", " + "Country and zip code: " + iAddress.showAddressFormat() 
	+ " phone: " + iphone1.showPhoneFormat() + phone);
	}
}
