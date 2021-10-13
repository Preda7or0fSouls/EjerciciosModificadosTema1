package control01;
import java.util.Scanner;
public class control01 {

	public static void main(String[] args) {
		int lado;
		
		double longitud = 0;
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Introduceme el lado");
		lado = entrada.nextInt();
		
		if(lado >5 && lado <=3) {
			System.out.println("el progtrama termino");
		
			
		}else {
			
			System.out.println("Dime la longitud");
			longitud = entrada.nextDouble();
		}
		System.out.println ("El perímetro del cuadrado es" + lado * longitud);
		
	}
}
