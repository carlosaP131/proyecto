package ahorcado.juego.pojo;

public class Monito_pojo {
	public  String Arraycabeza[][] = {{"      ==========|| "},
			 {"    ......      ||"},
			 {" ^//      \\\\^   ||"}, 
			 {"  ||  0 0  ||   ||"},
			 {"  ||   °   ||   ||"},
			 {"  \\\\   ^   //   ||"},
			 {"    .......     ||\n"}};
 public  String Arraycuerpo[][] = {{"      | |       ||"},
			 {"      | |       ||"},	
			 {"      | |       ||"}, 
			 {"      | |       ||"},
			 {"      | |       ||"},
			 {"      |0|       ||"},
			 {"      | |       ||"},
	         {" 		__\n"},};
public  String ArrayCuerpoBrazD[][] = {{"    //| |       ||  "},
			  	  {"   // | |       ||  "},	
			      {"  //  | |       ||  "}, 
		          {" //   | |       ||  "},
		          {"      | |       ||  "},
			      {"      |0|       ||  "},
		          {"      | |       ||  "},
		          {" 		__\n"},};
public  String ArrayCuerpoBrazDEI[][] = {{"    //| |\\\\     ||"},
			  	    {"   // | | \\\\    ||"},	
			        {"  //  | |  \\\\   ||"}, 
		            {" //   | |   \\\\  ||"},
		            {"      | |       ||"},
			        {"      |0|       ||"},
		            {"      | |       ||"},
		            {" 		__\n"},};
public  String ArrayCuerpoBrazosPi[][] = {{"    //| |\\\\     ||"},
				  	 {"   // | | \\\\    ||"},	
				     {"  //  | |  \\\\   ||"}, 
			         {" //   | |   \\\\  ||"},
			         {"      |0|       ||"},
				     {"      | |       ||"},
			         {"    //          ||"},
			         {"   //           ||"},
			         {"  //            ||"},
			         {" //             ||"},
			         {" 		__\n"},};
public  String ArrayCuerpoBrazosPies[][] = {{"    :::::::     ||"},
					   {"    //| |\\\\     ||"},
				  	   {"   // | | \\\\    ||"},	
				       {"  //  | |  \\\\   ||"}, 
			           {" //   | |   \\\\  ||"},
			           {"      |0|       ||"},
				       {"      | |       ||"},
			           {"     //  \\\\     ||"},
			           {"    //    \\\\    ||"},
			           {"   //      \\\\   ||"},
			           {"  //        \\\\  ||"},
			           {" 		__\n"},};
public  String[][] getArraycabeza() {
	return Arraycabeza;
}
public  void setArraycabeza(String[][] arraycabeza) {
	Arraycabeza = arraycabeza;
}
public  String[][] getArraycuerpo() {
	return Arraycuerpo;
}
public  void setArraycuerpo(String[][] arraycuerpo) {
	Arraycuerpo = arraycuerpo;
}
public  String[][] getArrayCuerpoBrazD() {
	return ArrayCuerpoBrazD;
}
public  void setArrayCuerpoBrazD(String[][] arrayCuerpoBrazD) {
	ArrayCuerpoBrazD = arrayCuerpoBrazD;
}
public  String[][] getArrayCuerpoBrazDEI() {
	return ArrayCuerpoBrazDEI;
}
public  void setArrayCuerpoBrazDEI(String[][] arrayCuerpoBrazDEI) {
	ArrayCuerpoBrazDEI = arrayCuerpoBrazDEI;
}
public  String[][] getArrayCuerpoBrazosPi() {
	return ArrayCuerpoBrazosPi;
}
public  void setArrayCuerpoBrazosPi(String[][] arrayCuerpoBrazosPi) {
	ArrayCuerpoBrazosPi = arrayCuerpoBrazosPi;
}
public  String[][] getArrayCuerpoBrazosPies() {
	return ArrayCuerpoBrazosPies;
}
public  void setArrayCuerpoBrazosPies(String[][] arrayCuerpoBrazosPies) {
	ArrayCuerpoBrazosPies = arrayCuerpoBrazosPies;
}
}
