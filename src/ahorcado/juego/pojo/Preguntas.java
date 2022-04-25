package ahorcado.juego.pojo;
// concepto abstracto que denato una serie de cualidades ,
// por ejemplo preguntas
public class Preguntas {
//atributos: conjunto de caracteeristicas que caomparten
	//los obketos de una clase , por ejemplo para el usuario 
	// tendriamos tipo pregunta num_preg respuesta
	
		private String tipo;
		private String pregunta;
		private long   num_preg;
		private String respuesta;
		 //contructir el motodo constructoe tiene siempre el mismo nombre que la clase 
		//se utiliza normalmente para inicializar los atributos 
		//@postconstruct permite inicializar objetos al iniciar la aplicacion 
		public Preguntas() {
		
		}
		
		public Preguntas(String tipo, String pregunta, String respuesta) {
			//this hace referencia al objeto actual de la clase es decir a una instancia en concreto 
			//de la clase y nos sirve para usar los metodos y atributos de esa clase
			//desde alguno de sus metodos para llamar a otro de sus constructores o simplemente para pasarle 
			//el objeto completo 
			this.tipo = tipo;
			this.pregunta = pregunta;
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
		public String getPregunta() {
			return pregunta;
		}
		public void setPregunta(String pregunta) {
			this.pregunta = pregunta;
		}
		public String getRespuesta() {
			return respuesta;
		}
		public void setRespuesta(String respuesta) {
			this.respuesta = respuesta;
		}
		public long getNum_preg() {
			return num_preg;
		}

		public void setNum_preg(long num_preg) {
			this.num_preg = num_preg;
		}

		
}
