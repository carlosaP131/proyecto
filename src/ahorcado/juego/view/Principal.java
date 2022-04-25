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
import ahorcado.juego.pojo.Preguntas;
			
public class Principal {
	private static JugadorController controller = new JugadorController() ;
	private static List<Jugador> lista = new ArrayList<>();
	private static List<Preguntas> preg = new ArrayList<>();
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); 
	Jugador jugador1 = new Jugador();
	Jugador jugador2 = new Jugador();
	Preguntas pregu = new Preguntas();
	jugador1.setId(1);
	System.out.println("Dame tu Nombre jugador ("+jugador1.getId()+")");
	jugador1.setNombre(scanner.nextLine());
	jugador1.setVida(5);
	
	
	jugador2.setId(2);
	System.out.println("dame tu nombre jugador ("+jugador2.getId()+")");
	jugador2.setNombre(scanner.nextLine());
	jugador2.setVida(5);
	pregu.setNum_preg(1);
	pregu.setPregunta("¿quien descubrio america?");
	
	controller.crearJugador(lista, jugador1);
	controller.crearJugador(lista, jugador2);
	controller.mostrarJugador(lista);
	
	}

}
