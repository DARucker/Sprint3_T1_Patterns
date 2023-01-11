package practicas.main;

import practicas.intermediate.FabricaAbstracta;

public class FabricProducer {

	public static FabricaAbstracta getFactory(String tipoFabrica) {
		
		if(tipoFabrica.equalsIgnoreCase("BD")) {
			return new ConectionBDFabric();
		}else if(tipoFabrica.equalsIgnoreCase("REST")) {
			return new ConectionRestFrabric();
		}
		return null;
	}
	
}
