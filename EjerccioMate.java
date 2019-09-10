package CursoUdemy;

import java.util.Scanner;

public class EjerccioMate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");		
		int numero2 = sc.nextInt();
		
		int suma = numero1+numero2;
		int mul = numero1*numero2;	
		int resta = numero1-numero2;
		
		
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);
		System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resta);
		System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es " + mul);
		
		if (numero2 == 0) {
			System.out.println ("No se puede dividir por 0 ");
		} else {
				double div = (double) numero1/numero2;	
				System.out.println("La division de " + numero1 + " y " + numero2 + " es " + div);
		}
		
		sc.close();
		
	}

}
