/****************************************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez 
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: clase de pruebas  
 **                                                                                                 
 * *************************************************************************************************/
package ahorcado.juego.view;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import ahorcado.juego.controller.JugadorController;
import ahorcado.juego.pojo.Jugador;
import ahorcado.juego.pojo.Palabra;
			
public class Principal {
	private static JugadorController controller = new JugadorController() ;
	private static List<Jugador> lista = new ArrayList<>();
	//private static List<Palabra> preg = new ArrayList<>();
	public static Scanner scanner;
	public static void main(String[] args) {
		
		
		scanner = new Scanner(System.in);
	Jugador jugador1 = new Jugador();
	Jugador jugador2 = new Jugador();
	Palabra pregu = new Palabra();
	jugador1.setId(1);
	System.out.println("Dame tu Nombre jugador ("+jugador1.getId()+")");
	jugador1.setNombre(scanner.nextLine());
	jugador1.setVida(5);
	
	
	jugador2.setId(2);
	System.out.println("dame tu nombre jugador ("+jugador2.getId()+")");
	jugador2.setNombre(scanner.nextLine());
	

	jugador2.setVida(5);
	pregu.setNum_palab(1);
	pregu.setPalabra("¿quien descubrio america?\n");
	System.out.println(pregu.getPalabra());
	pregu.setRespuesta(scanner.nextLine());
	 if(pregu.getRespuesta().equalsIgnoreCase("cristobal colon")) {
		 System.out.println("correcto");
	 }else {
		 jugador1.setVida(4);
		 System.out.println("Error se te resta una vida \n vidas restantes "+jugador1.getVida());
		 System.out.println("   ( ) ");
		 System.out.println("    *  ");
		 System.out.println(" *  *  *");
		 System.out.println("*   *   *");
		 System.out.println("  *   *");
		 System.out.println(" *     *");
		 System.out.println("*       *");
	 }
	 
	 
	 
	controller.crearJugador(lista, jugador1);
	controller.crearJugador(lista, jugador2);
	controller.mostrarJugador(lista);
	
	}

}
