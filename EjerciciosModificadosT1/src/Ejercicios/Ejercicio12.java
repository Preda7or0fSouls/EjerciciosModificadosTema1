package Ejercicios;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		int num1 =0;
		int num2 =0;
		
		Scanner entrada = new Scanner( System.in );
		
		System.out.print( "Introduce el primer numero: ");
		 while (!entrada.hasNextInt()) {
             System.out.println("Valor no válido");
             entrada.next();
             System.out.print("Introduce un número entero positivo: ");                               
      }
        num1 = entrada.nextInt();
		
        System.out.print( "Introduce el segundo numero: ");
        while (!entrada.hasNextInt()) {
            System.out.println("Valor no válido");
            entrada.next();
            System.out.print("Introduce un número entero positivo: ");                               
     }
        num2 = entrada.nextInt();
        entrada.close();
        System.out.println("El mayor de los dos números es " + Math.max(num1, num2));



	}
	
}
