package CursoUdemy;

import java.util.*;

public class RecorrerCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char contadorCaracteres;
		String cadenaUsuarioConcatenar;
		String cadenaConcatenada = "";
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
	
			
		System.out.println("Introduzca una cadena de caracteres: ");
		cadenaUsuarioConcatenar = sc.next();
		
		while (!cadenaUsuarioConcatenar.isEmpty()) {
			
			cadenaConcatenada += cadenaUsuarioConcatenar; 
			
			System.out.println("Introduzca otra cadena de caracteres: ");
			cadenaUsuarioConcatenar = sc.next();
		}
		
		System.out.println("Las cadenas concatenadas son: " + cadenaConcatenada);
		sc.close();
		
		
	}

}
