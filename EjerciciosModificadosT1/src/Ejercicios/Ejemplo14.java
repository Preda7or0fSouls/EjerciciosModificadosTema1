package Ejercicios;

import java.util.Scanner;

public class Ejemplo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;

		System.out.println("Introduce la nota del examen");

		Scanner inputValue;
		inputValue = new Scanner(System.in);

		nota = inputValue.nextInt();

		inputValue.close();

		switch (nota) {

		case 0:
			System.out.println("Muy Deficiente");
			break;
		case 1:
			System.out.println("Muy Deficiente");
			break;
		case 2:
			System.out.println("Muy Deficiente");
			break;
		case 3:
			System.out.println("Insuficiente");
			break;
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
			System.out.println("Notable");
			break;
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Sobresaliente");
			break;
		}
	}
}