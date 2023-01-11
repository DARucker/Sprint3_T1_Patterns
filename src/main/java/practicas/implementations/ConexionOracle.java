package practicas.implementations;

import practicas.intermediate.IConexionDB;

public class ConexionOracle implements IConexionDB {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	
	public ConexionOracle() {
		super();
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {

		System.out.println("Se conecto a Oracle");
	}

	@Override
	public void desconectar() {

		System.out.println("Se desconecto a Oracle");

	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
