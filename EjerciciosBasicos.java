package CursoUdemy;

import java.util.Scanner;

public class EjerciciosBasicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Instanciamos metodod e la clase scanner para 
		 * solicitar un nombre por consola.
		 * con useDelimiter podemos incluir cadenas con espacios
		 */
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
			
		
		System.out.println("Buenas, Introduzca su nombre y apellidos: ");
		String name = sc.next();
		System.out.println("Encantado de conocerte " + name);

		sc.close();
	}

}
