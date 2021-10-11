package Ejercicios;
import java.util.Scanner;


public class Ejemplo18 {
	public static void main(String argv[]) {
		int horas;
		int minutos;
		int segundos;
		Scanner miScanner;


		
		miScanner = new Scanner(System.in);
		

		System.out.println("Introduce las horas:");
		horas = miScanner.nextInt();
		
		System.out.println("Introduce los minutos:");
		minutos = miScanner.nextInt();
		
		System.out.println("Introduce los segundos:");
		segundos = miScanner.nextInt();
		

		segundos = segundos ++;
		

		if (60 == segundos) {
			minutos++;
			segundos = 0;
		}
		

		if (60 == minutos) {
			horas++;
			minutos = 0;
		}
		

		if (24 == horas) {
			horas = 0;
		}

		System.out.printf("Ahora son %d:%d:%d %n", horas, minutos, segundos);
		miScanner.close();
	}
}