package CursoUdemy;

import java.util.Scanner;

public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int puntos = 0;
		int contador = 0;
		int tablaMultiplicar, number, multi;
		int resultado = 0;
		
		System.out.println ("Introduzca la tabla de multiplicar que quieres practicar: ");
		tablaMultiplicar = sc.nextInt();
		
		while (contador < 9 && puntos <=100 ) {
			System.out.println("La puntuacion hasta ahora es: " + puntos);
			
			number = (int) (Math.random()* 10);
			System.out.println ("¿ Resultado de multiplicar " + tablaMultiplicar + " x " + number + " ?");
			multi = tablaMultiplicar*number;
			resultado = sc.nextInt();
			
			if (resultado == multi) {
				puntos+=10;
				
			} else {
				puntos-=10;
			}
			contador+=1;
		}
		
		System.out.println ("Su puntuacion final es: " + puntos);
		
		if (puntos >=110) {
			System.out.println("Ha obtenido una medalla de ORO ");
		} else if (puntos >=90) {
			System.out.println("Ha obtenido una medalla de PLATA ");
		} else if (puntos >= 80) {
			System.out.println("Ha obtenido una medalla de BRONCE ");
		} else {
			System.out.println("No ha obtenido ninguna medalla, HAY QUE PRACTICAR MASSSSS ");
		}
		sc.close();

	}

		
}

