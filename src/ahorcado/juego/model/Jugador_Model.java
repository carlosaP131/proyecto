package ahorcado.juego.model;

import java.util.List;
import ahorcado.juego.pojo.Jugador;

public class Jugador_Model {
//operaciones CRUD C=create R=read D=delete 
	public List<Jugador> crearJugador(List<Jugador> lista, Jugador jugador) {
		lista.add(jugador);
		return lista;
	}

public List<Jugador> eliminarJugador(List<Jugador> lista,long idJugador){
	Jugador jugador = new Jugador();
	jugador = lista.get((int) idJugador);
	lista.remove(jugador);
	return lista;
}
public void mostrarJugador(List<Jugador> lista) {
		for(Jugador jugador:lista) {
			System.out.println("id"+ jugador.getId());
			System.out.println("Nombre"+ jugador.getNombre());
			System.out.println("Vidas"+ jugador.getVida());
			
		}

}
}
