package Ejercicios;

import java.util.Scanner;

public class Ejemplo27 {

	
    public static void main(String[] args)
    {	
		int num;
		String result = "";
		Scanner miScanner = new Scanner(System.in);
		
		System.out.println("Introduce un número entero:");
		
		num = miScanner.nextInt();
		
		for (int x = 1; x <= num; x++) {

			result += x + " ";
			System.out.println(result);
		}
		
		miScanner.close();
    }
}
