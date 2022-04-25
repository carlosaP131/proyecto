package ahorcado.juego.controller;

import java.util.List;

import ahorcado.juego.model.Preguntas_Model;
import ahorcado.juego.pojo.Preguntas;

public class PreguntaController {
	private Preguntas_Model model = new Preguntas_Model();
	public List<Preguntas> crearPreguntas(List<Preguntas> preg, Preguntas pregunta) {
		return model.crearPreguntas(preg, pregunta);
	}
	public List<Preguntas> eliminarJugador(List<Preguntas> preg,long num_preg){
		return model.eliminarPreguntas(preg, num_preg);
	}
	public void mostrarJugador(List<Preguntas> preg) {
		model.mostrarPreguntas(preg);
		}
}
