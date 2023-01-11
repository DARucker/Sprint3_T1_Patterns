package practicas.main;

import practicas.intermediate.FabricaAbstracta;
import practicas.intermediate.IConexionDB;
import practicas.intermediate.IConexionREST;

public class App_PracticeAbstractFactory {

	public static void main(String args[]) {
		
		FabricaAbstracta fabricaBD = FabricProducer.getFactory("BD");
		IConexionDB BD1 = fabricaBD.getBD("mysql");
		BD1.conectar();
		
		FabricaAbstracta fabricaREST = FabricProducer.getFactory("rest");
		IConexionREST rest1 = fabricaREST.getREST("ventas");
		rest1.leerURL("http.ventas.com");
	}
	
}
