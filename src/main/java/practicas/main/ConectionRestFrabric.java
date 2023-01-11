package practicas.main;

import practicas.implementations.ConexionMySQL;
import practicas.implementations.ConexionOracle;
import practicas.implementations.ConexionVacia;
import practicas.implementations.conexionRESTCompras;
import practicas.implementations.conexionRESTVentas;
import practicas.intermediate.FabricaAbstracta;
import practicas.intermediate.IConexionDB;
import practicas.intermediate.IConexionREST;

public class ConectionRestFrabric implements FabricaAbstracta {

	@Override
	public IConexionDB getBD(String motor) {

		return null;
	}

	@Override
	public IConexionREST getREST(String area) {

		if (area == null) {
			return null;
		}
		if (area.equalsIgnoreCase("compras")) {
			return new conexionRESTCompras();
		} else if (area.equalsIgnoreCase("ventas")) {
			return new conexionRESTVentas();
		}
		return null;
	}

}
