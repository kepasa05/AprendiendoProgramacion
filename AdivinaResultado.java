package CursoUdemy;

import java.util.Scanner;



public class AdivinaResultado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*** Adivina el numero
		 * Introduce dos 2 numeros 
		 * y se debe adivinar el resultado de ciertas operaciones
		 */
		
		int number1, number2, suma, mult, resta;
		int resultadoSuma,resultadoResta, resultadoMult, resultadoDiv;
		int puntos;
		double div;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		number1 = sc.nextInt();
		System.out.println ("Introduce el segundo numero: ");
		number2 = sc.nextInt();
		
		//Operaciones basicas		
		suma = number1 + number2;
		resta = number1 - number2;
		mult = number1 * number1;
		div = (double) number1/number2;
		
		puntos = 0; 
		System.out.println ("Introduce el resultado de la suma de " + number1 + " y " + number2);
		resultadoSuma = sc.nextInt();
				
		
		if (resultadoSuma == suma) {			
			puntos += 5;
			System.out.println("Acertaste!!!!!! tu puntuacion es " + puntos);
			
		} else {		
			puntos -= 5;
			System.out.println("Fallaste!!!!!! tu puntuacion es " + puntos);
		}
		
		System.out.println ("Introduce el resultado de la resta de " + number1 + " y " + number2);
		resultadoResta = sc.nextInt();
		
		if (resultadoResta == resta) {			
			puntos += 5;
			System.out.println("Acertaste!!!!!! tu puntuacion es " + puntos);
			
		} else {		
			puntos -= 5;
			System.out.println("Fallaste!!!!!! tu puntuacion es " + puntos);
		}
		
		System.out.println ("Introduce el resultado de multiplicar el numero " + number1 + " y el numero" + number2);
		resultadoMult = sc.nextInt();
		
		if (resultadoMult == mult) {			
			puntos += 10;
			System.out.println("Acertaste!!!!!! tu puntuacion es " + puntos);
			
		} else {		
			puntos -= 5;
			System.out.println("Fallaste!!!!!! tu puntuacion es " + puntos);
		}
		
		System.out.println ("Introduce el resultado de dividir el numero " + number1 + " entre el numero" + number2);
		resultadoDiv = sc.nextInt();
		
		if (resultadoDiv == div) {			
			puntos += 20;
			System.out.println("Acertaste!!!!!! tu puntuacion es " + puntos);
			
		} else {		
			puntos -= 5;
			System.out.println("Fallaste!!!!!! tu puntuacion es " + puntos);
		}
		
		sc.close();
	}

}
