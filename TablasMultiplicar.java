package CursoUdemy;

import java.util.Scanner;

public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int points = 10;
		int tablaMultiplicar, number, multi;
		int resultado = 0;
		
		System.out.println ("Introduzca la tabla de multiplicar que quieres practicar: ");
		tablaMultiplicar = sc.nextInt();
		
		while (points >= 10 && points <=100 ) {
			System.out.println("La puntuacion hasta ahora es: " + points);
			
			number = (int) (Math.random()* 10);
			System.out.println ("¿ Resultado de multiplicar " + tablaMultiplicar + " x " + number + " ?");
			multi = tablaMultiplicar*number;
			resultado = sc.nextInt();
			
			if (resultado == multi) {
				points+=10;
				
			} else {
				points-=5;
			}
			
		}
		
		System.out.println ("Su puntuacion final es: " + points);
		
		if (points >=110) {
			System.out.println("Ha obtenido una medalla de ORO ");
		} else if (points >=90) {
			System.out.println("Ha obtenido una medalla de PLATA ");
		} else if (points >= 80) {
			System.out.println("Ha obtenido una medalla de BRONCE ");
		} else {
			System.out.println("No ha obtenido ninguna medalla, HAY QUE PRACTICAR MASSSSS ");
		}
		sc.close();

	}

		
}

