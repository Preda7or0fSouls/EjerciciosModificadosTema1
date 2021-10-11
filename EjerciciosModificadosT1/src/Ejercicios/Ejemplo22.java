package Ejercicios;
import java.util.Scanner;

public class Ejemplo22 {



	
    public static void main(String[] args)
    {	
		int num;

		int positivos = 0;
		Scanner miScanner = new Scanner(System.in);
		
		System.out.println("Introduce 10 números enteros");
		
		for (int x = 0; x < 10; x++) {
			num= miScanner.nextInt();
			
			if (num >= 0){

				positivos++;
			}
		
		}
		
		System.out.println("Ha introducido " + positivos + " números positivos");
		System.out.println("Ha introducido " + (10 - positivos) + " números negativos");
		
		miScanner.close();
    }
}
