package practicas.main;

import practicas.implementations.ConexionMySQL;
import practicas.implementations.ConexionOracle;
import practicas.implementations.ConexionVacia;
import practicas.intermediate.FabricaAbstracta;
import practicas.intermediate.IConexionDB;
import practicas.intermediate.IConexionREST;

public class ConectionBDFabric implements FabricaAbstracta {

	@Override
	public IConexionDB getBD (String motor) {
		if(motor == null) {
			return new ConexionVacia();
		}
		if(motor.equalsIgnoreCase("mysql")) {
			return new ConexionMySQL();
		} else if(motor.equalsIgnoreCase("oracle")) {
			return new ConexionOracle();
	}
		return new ConexionVacia();

}

	@Override
	public IConexionREST getREST(String area) {
	
		return null;
	}
}
