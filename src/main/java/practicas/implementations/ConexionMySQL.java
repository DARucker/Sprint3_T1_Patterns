package practicas.implementations;

import practicas.intermediate.IConexionDB;

public class ConexionMySQL implements IConexionDB {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	
	public ConexionMySQL() {
		super();
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {

		System.out.println("Se conecto a MySQL");
	}

	@Override
	public void desconectar() {

		System.out.println("Se desconecto a MySQL");

	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}
