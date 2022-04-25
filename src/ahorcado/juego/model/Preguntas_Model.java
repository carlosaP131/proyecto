package ahorcado.juego.model;

import java.util.List;

import ahorcado.juego.pojo.Preguntas;

public class Preguntas_Model {
	public List<Preguntas> crearPreguntas(List<Preguntas> preg, Preguntas pregunta){
		preg.add(pregunta);
		return preg;
	}
	public List<Preguntas> eliminarPreguntas(List<Preguntas> preg,long  num_preg){
		Preguntas preguntas = new Preguntas();
		preguntas = preg.get((int) num_preg);
		preg.remove(preguntas);
		return preg;
	}
	public void mostrarPreguntas(List<Preguntas> preg) {
		for(Preguntas preguntas :preg) {
			System.out.println("numero pregunta: "+ preguntas.getNum_preg());
			System.out.println(preguntas.getPregunta());
			System.out.println("pregunta del tipo"+preguntas.getTipo());
			
		}

}}
