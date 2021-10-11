package Ejercicios;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		
		int edad;
		Scanner entrada = new Scanner( System.in );
		
		System.out.println("Introduce tu edad");
		 while (!entrada.hasNextInt()) {
             System.out.println("Edad mal puesta");
             entrada.next();
             System.out.print("La edad debe ser  mayor de un año: ");                               
      }
		 edad = entrada.nextInt();
		if (edad>=18){
			System.out.println("Es mayor de edad");
		}else{
		
		}
		entrada.close();
		
	}
}