package Ejercicios;

import java.util.Scanner;

public class Ejemplo25 {

	
    public static void main(String[] args)
    {	
		int num;

		int factorial = 1;
		
		Scanner inputValue = new Scanner(System.in);
		
		System.out.println("Introduce un número entero:");
		
		num = inputValue.nextInt();

		for (int x = 2; x <= num; x++) {

			factorial *= x;
		}
		
		System.out.printf("El factorial de %d es %d", num, factorial);
		
		inputValue.close();
    }
}
