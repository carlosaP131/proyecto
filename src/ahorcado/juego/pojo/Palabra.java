package ahorcado.juego.pojo;
// concepto abstracto que denato una serie de cualidades ,
// por ejemplo preguntas
public class Palabra {
//atributos: conjunto de caracteeristicas que caomparten
	//los obketos de una clase , por ejemplo para el usuario 
	// tendriamos tipo pregunta num_preg respuesta
	
		private String tipo;
		private String palabra;
		private long   num_palab;
		private String respuesta;
		 //contructir el motodo constructoe tiene siempre el mismo nombre que la clase 
		//se utiliza normalmente para inicializar los atributos 
		//@postconstruct permite inicializar objetos al iniciar la aplicacion 
		public Palabra() {
		
		}
		
		public Palabra(String tipo, String palabra, String respuesta) {
			//this hace referencia al objeto actual de la clase es decir a una instancia en concreto 
			//de la clase y nos sirve para usar los metodos y atributos de esa clase
			//desde alguno de sus metodos para llamar a otro de sus constructores o simplemente para pasarle 
			//el objeto completo 
			this.tipo = tipo;
			this.palabra = palabra;
			this.respuesta = respuesta;
		}
		//metodos es un conjunto de instrucciones definidas dentro de una clase 
		//que realizan una eterminada tarea 
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getPalabra() {
			return palabra;
		}
		public void setPalabra(String palabra) {
			this.palabra = palabra;
		}
		public String getRespuesta() {
			return respuesta;
		}
		public void setRespuesta(String respuesta) {
			this.respuesta = respuesta;
		}
		public long getNum_palab() {
			return num_palab;
		}

		public void setNum_palab(long num_palab) {
			this.num_palab = num_palab;
		}

		
}
