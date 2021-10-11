package Ejercicios;

import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {

		int num1;
		int num2;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el primer numero: ");

		while (!entrada.hasNextInt()) {
			System.out.println("Valor no válido");
			entrada.next();
			System.out.print("Introduce un número entero positivo: ");
		}
		num1 = entrada.nextInt();


		System.out.println("Introduzca el segundo numero: ");
		while (!entrada.hasNextInt()) {
			System.out.println("Valor no válido");
			entrada.next();
			System.out.print("Introduce un número entero positivo: ");
		}
		num2 = entrada.nextInt();
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;

		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + mult);
		System.out.println("La division es: " + div);
	}

}
