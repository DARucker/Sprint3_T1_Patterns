package practicas.implementations;

import practicas.intermediate.IConexionREST;

public class conexionRESTCompras implements IConexionREST {

	@Override
	public void leerURL(String url) {
		System.out.println("conectando con " + url);		
	}

}
