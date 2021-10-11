package Ejercicios;

import java.util.Scanner;
/*
 * Escribe un programa que lea un número y escriba su tabla de multiplicación
 */
public class Ejemplo26 {


	
    public static void main(String[] args)
    {	
		int numero;
		
		Scanner inputValue = new Scanner(System.in);
		
		System.out.println("Introduce un número entero entre el 1 y el 9:");
		
		numero = inputValue.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d", numero, i, (numero * i));
			System.out.println("");
		}
		
		
		inputValue.close();
    }
}
