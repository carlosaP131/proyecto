package ahorcado.juego.view;
import java.util.ArrayList;
import java.util.List;

import ahorcado.juego.controller.JugadorController;
import ahorcado.juego.pojo.Jugador;
public class Principal {
	private static JugadorController controller = new JugadorController() ;
	private static List<Jugador> lista = new ArrayList<>();
	public static void main(String[] args) {
	Jugador jugador1 = new Jugador();
	Jugador jugador2 = new Jugador();
	
	jugador1.setId(1);
	jugador1.setNombre("carlos");
	jugador1.setVida(5);
	
	
	jugador2.setId(2);
	jugador2.setNombre("jose");
	jugador2.setVida(5);
	
	controller.crearJugador(lista, jugador1);
	controller.crearJugador(lista, jugador2);
	controller.mostrarJugador(lista);
	
	}

}
