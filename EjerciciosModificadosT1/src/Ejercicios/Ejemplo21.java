package Ejercicios;
import java.util.Scanner;

public class Ejemplo21 {
	public static void main(String[] args) {
		int anyo;

		boolean Bisiesto = false;
		Scanner miScanner;

		System.out.println("Introduce un año:");
		

		
		miScanner = new Scanner(System.in);
		anyo = miScanner.nextInt();
		

		
		if ((anyo % 400 == 0 ) || ((anyo % 4 == 0 ) && (anyo % 100 != 0 ))) {

			Bisiesto = true;
		}
		


		
		if (Bisiesto) {
			 System.out.println("Es bisiesto");
		}else {
			 System.out.println("No es bisiesto");
		}
		
			
		
		miScanner.close();

	}
}
