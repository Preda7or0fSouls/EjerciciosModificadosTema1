package Ejercicios;

import java.util.Scanner;

public class Ejemplo20 {

	public static void main(String[] args) {
		float precio;
		float descuento;
		Scanner miScanner;


		
		miScanner = new Scanner(System.in);
		

		System.out.println("Introduce el precio:");
		precio = miScanner.nextFloat();


		if (precio < 6) {
			descuento = 0;
		}else if(precio < 60) {
			descuento = precio * 0.05f;
		}else {
			descuento = precio * 0.10f;
		}

		System.out.println("El precio final es: " + (precio - descuento) + " €");
		miScanner.close();

	
	}

}
