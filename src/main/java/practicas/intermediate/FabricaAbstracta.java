package practicas.intermediate;

public interface FabricaAbstracta {

	IConexionDB getBD(String motor);
	IConexionREST getREST(String area);
}
