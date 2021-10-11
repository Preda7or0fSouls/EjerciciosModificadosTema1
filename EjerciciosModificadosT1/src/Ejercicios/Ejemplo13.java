package Ejercicios;

import java.util.Scanner;

public class Ejemplo13 {

	public static void main(String[] args) {

		int valor1;
		int valor2 = 0;
		int respuesta;
		Scanner entrada;
		
		entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		
		valor1 = entrada.nextInt();

		System.out.println("Introduce el segundo numero: ");
	    valor2 = entrada.nextInt();
	  
		System.out.println("Pulsa 1 para ordenar ascendentemente");
		System.out.println("Pulsa 2 para ordenar descendentemente");

		respuesta = entrada.nextInt();
		

		switch (respuesta) {

		case 1:
			if (valor1 > valor2) {
				System.out.println("El orden ascendente es " + valor1 + "," + valor2);

			} else {
				System.out.println("El orden ascendente es " + valor2 + "," + valor1);
			}
			break;

		case 2:
			if (valor1 < valor2) {
				System.out.println("El orden descendente es " + valor1 + "," + valor2);

			} else {
				System.out.println("El orden descendente es " + valor2 + "," + valor1);
			}
		}
	}
}
