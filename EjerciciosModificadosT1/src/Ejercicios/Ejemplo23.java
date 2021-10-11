package Ejercicios;

import java.util.Scanner;

public class Ejemplo23 {

	
    public static void main(String[] args)
    {	
		int dato;

		int positivos = 0;
		int cuantos = 0;
		Scanner miScanner = new Scanner(System.in);
		
		System.out.println("Introduce números enteros (para acabar introduce un 0)");

		do{
			dato = miScanner.nextInt();
			if (dato != 0){
				if (dato > 0){
					positivos++;
				}
				cuantos++;
			}

		}while ( dato != 0);
		
		System.out.println("Ha introducido " + positivos + " números positivos");
		System.out.println("Ha introducido " + (cuantos - positivos) + " números negativos");
		
		miScanner.close();
    }
}
