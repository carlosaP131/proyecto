/****************************************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez 
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: clase para mostrar el monito  
 **                                                                                                 
 * *************************************************************************************************/


package ahorcado.juego.view;
import java.util.Scanner;
import ahorcado.juego.pojo.Monito_pojo;
public class Monito {
		Monito_pojo monito = new Monito_pojo();
	
	/*
	static String Arraycabeza[][] = {{"      ==========|| "},
									 {"    ......      ||"},
									 {" ^//      \\\\^   ||"}, 
									 {"  ||  0 0  ||   ||"},
									 {"  ||   °   ||   ||"},
									 {"  \\\\   ^   //   ||"},
									 {"    .......     ||\n"}};
	static String Arraycuerpo[][] = {{"      | |       ||"},
									 {"      | |       ||"},	
									 {"      | |       ||"}, 
									 {"      | |       ||"},
									 {"      | |       ||"},
									 {"      |0|       ||"},
									 {"      | |       ||"},
							         {" 		__\n"},};
	static String ArrayCuerpoBrazD[][] = {{"    //| |       ||  "},
									  	  {"   // | |       ||  "},	
									      {"  //  | |       ||  "}, 
								          {" //   | |       ||  "},
								          {"      | |       ||  "},
									      {"      |0|       ||  "},
								          {"      | |       ||  "},
								          {" 		__\n"},};
	static String ArrayCuerpoBrazDEI[][] = {{"    //| |\\\\     ||"},
									  	    {"   // | | \\\\    ||"},	
									        {"  //  | |  \\\\   ||"}, 
								            {" //   | |   \\\\  ||"},
								            {"      | |       ||"},
									        {"      |0|       ||"},
								            {"      | |       ||"},
								            {" 		__\n"},};
	static String ArrayCuerpoBrazosPi[][] = {{"    //| |\\\\     ||"},
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
	static String ArrayCuerpoBrazosPies[][] = {{"    :::::::     ||"},
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
									           {" 		__\n"},};*/
												
	static Scanner sn = new Scanner(System.in);
		/*public static void main(String[] args) {
			
			
			
			boolean salir = false;
		//for (int a = 0; a < 4; a++) {
			int a;
			do {
				
				System.out.println("\nEscribe una de las opciones");
		           a = sn.nextInt();
			switch (a) {
			case 6:
				imprimirCabeza();
				break;
			case 5:
				imprimirCabeza();
				imprimirCuerpo();
				break;
			case 4:
					imprimirCabeza();
					imprimirBrazoD();
					
				break;
			case 3:
					imprimirCabeza();
					imrprimirBrazos();
				break;
			case 2: 
				    imprimirCabeza();
				    imprimirBrazoyPieD();
				    break;
			case 1:
					imprimirCabeza();
					imprimirBrazosyPies();
					break;
			case 0:
				salir = true;
				break;
			}
		}while(!salir);
	//}
		}*/
	public void imprimirCabeza() {
		for (int i = 0; i < 7; i++) {
			System.out.println("");
			for (int j = 0; j < 1; j++) {
				System.out.print(monito.Arraycabeza[i][j]);
			}
		}
	}
	public  void imprimirCuerpo() {
		for (int k = 0; k < 8; k++) {
			System.out.println("");
			for (int l = 0; l < 1; l++) {
				System.out.print(monito.Arraycuerpo[k][l]);

			}
		}
	}
	public void imprimirBrazoD() {
		for (int k = 0; k < 8; k++) {
			System.out.println("");
			for (int l = 0; l < 1; l++) {
				System.out.print(monito.ArrayCuerpoBrazD[k][l]);
			}
		}
	
	}
	public  void imrprimirBrazos() {
		for (int k = 0; k < 8; k++) {
			System.out.println("");
			for (int l = 0; l < 1; l++) {
				System.out.print(monito.ArrayCuerpoBrazDEI[k][l]);
			}
		}
	}
	public  void imprimirBrazoyPieD() {
		for (int k = 0; k < 11; k++) {
			System.out.println("");
			for (int l = 0; l < 1; l++) {
				System.out.print(monito.ArrayCuerpoBrazosPi[k][l]);
			}
		}
	}
	public  void imprimirBrazosyPies() {
		for (int k = 0; k < 12; k++) {
			System.out.println("");
			for (int l = 0; l < 1; l++) {
				System.out.print(monito.ArrayCuerpoBrazosPies[k][l]);
			}
		}
	}
	}
