package Ejercicios;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		
		int num1 =0;
		int num2 =0;
		
		Scanner entrada = new Scanner( System.in );
		
		System.out.print( "Introduce el primer numero: ");
        num1 = entrada.nextInt();
        while (!entrada.hasNextInt()) {
            System.out.println("Valor no válido");
            entrada.next();
            System.out.print("Introduce un número entero positivo: ");                               
     }
		
        System.out.print( "Introduce el segundo numero: ");
        while (!entrada.hasNextInt()) {
            System.out.println("Valor no válido");
            entrada.next();
            System.out.print("Introduce un número entero positivo: ");                               
     }
        num2 = entrada.nextInt();
        
        System.out.println("El orden de los dos números es " + Math.max(num1, num2) + " y " + Math.min(num1, num2) );

	}

}
