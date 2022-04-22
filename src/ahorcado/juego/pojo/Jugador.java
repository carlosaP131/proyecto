/****************************************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez 
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: pojo jugador  
 **                                                                                                 
 * *************************************************************************************************/
package ahorcado.juego.pojo;

public class Jugador {
		private long id;
		private String nombre;
		private int vida;
		public Jugador() {
			
		}
		public Jugador(long id, String nombre, int vida) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.vida = vida;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getVida() {
			return vida;
		}
		public void setVida(int vida) {
			this.vida = vida;
		}
		
}
