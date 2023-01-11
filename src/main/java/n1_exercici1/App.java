package n1_exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	/* 
	 * En todos los ejercicios, crea un proyecto con una clase Main que demuestre 
	 * el uso del patron (con las necesarias invocaciones).
	 * 
	 * Singleton
	 * Crea una clase que replique el funcionamiento del comando 'Undo'. Esta clase 
	 * sera utilizada por la clase Main, que permitira introducir opciones por consola. 
	 * 
	 * La clase 'Undo' debe guardar los ultimos pedidos introducidos. Debe permitir
	 * añadir o eliminar pedidos, asi como listar los ultimos pedidos introducidos 
	 * (similar al comando 'history' en Linux).
	 * 
	 *  La clase 'Undo' debe implementar imprescindiblemente un patron Singleton. 
	 */

	public static String response;
	public static List<Object> controlObject = new ArrayList<>();
	
	public static void main(String[] args) {
			App.application();
		
	}
	
	public static void application() {
		
		do  {
			
		System.out.println("\n");
		System.out.println("1 : sum");
		System.out.println("2 : sustract");
		System.out.println("3 : multiply");
		System.out.println("4 : divide");
		System.out.println("5 : undo");
		System.out.println("6 : print history ");
		System.out.println("7 : exit");
		System.out.println("****" + "\n");
		App.captureString("insert your choice: ");		
		Undo undo = Undo.getInstance();
		controlObject.add(undo);
		undo.dataStack(response);
		
		} while (!response.equals("7"));
		System.out.println(" ");
		System.out.println("Used objects list: "  + "\n");
		int j = 0;
		for (Object object : controlObject) {
			j++;
			System.out.println("lap number " + j + " objeto used: " + object);
		}
		
	}
	
	
	
	public static String captureString (String message) {

		Scanner scanner = new Scanner (System.in);
		System.out.println(message);
		response = scanner.nextLine();
		return response;
	}

}
