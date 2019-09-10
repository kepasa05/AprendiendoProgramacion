package CursoUdemy;

import java.util.*;

public class RecorrerCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char contenidoCaracter;
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");

		System.out.println("Introduzca una cadena de caracteres: ");
		String cadenaCaracter = sc.next();
		
		System.out.println("La cadena introducida tiene una longitud de " + + cadenaCaracter.length() + " caracteres" );
		
		for (int i = 0; i < cadenaCaracter.length();i++) {
			contenidoCaracter = cadenaCaracter.charAt(i);
			System.out.println(contenidoCaracter);
		}
		
		
		sc.close();
		
		
	}

}
