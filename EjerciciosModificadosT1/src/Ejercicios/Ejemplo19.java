package Ejercicios;
import java.util.Scanner;



public class Ejemplo19 {
	public static void main(String argv[]) {
		int H;
		float precio;
		float bruto;
		float impuestos;
		Scanner miScanner;

		miScanner = new Scanner(System.in);
		

		System.out.println("Introduce las horas:");
		H = miScanner.nextInt();
		
		System.out.println("Introduce el precio por hora:");
		precio = miScanner.nextFloat();
	

		if (H <= 35) {
			bruto = H* precio;
		}else {

			bruto = 35 * precio;

			bruto += (H - 35) * precio * 1.5;
		}

		if (bruto <= 500) {
			impuestos = 0;
		}else if (bruto <= 900){

			impuestos = (bruto - 500) * 0.25f;
		}else {

			impuestos = (400 * 0.25f) + (bruto - 500 - 400) * 0.45f;
		}
		
		miScanner.close();

		
		System.out.println("Pago bruto: " + bruto);
		System.out.println("Salario neto: " + (bruto - impuestos));
		System.out.println("Impuestos: " + impuestos);
		
	}
}