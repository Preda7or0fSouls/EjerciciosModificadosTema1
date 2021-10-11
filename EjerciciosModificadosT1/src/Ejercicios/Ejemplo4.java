package Ejercicios;
import java.util.Scanner;
public class Ejemplo4 {

	public static void main(String[] args) {
		
		float x = 0;
		float squareArea;
		
		System.out.println("Introduce el lado: ");
		
		Scanner inputValue;
		
		inputValue = new Scanner(System.in);
		
		while (!inputValue.hasNextFloat()) {
			System.out.println("valor no valido");
		
			inputValue.next();
	       
	         System.out.println("Introduce el numero bien");
	      }
	
		x = inputValue.nextFloat();
		squareArea = x * x;
		System.out.println(squareArea);
		inputValue.close();

 
	}
}
