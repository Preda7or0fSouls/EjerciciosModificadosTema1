package Ejercicios;

import java.util.Scanner;
public class Ejercicio9 {
	
public static void main(String[] args) {
		
		int edad;
		Scanner entrada = new Scanner( System.in );
		
		System.out.println("Introduce tu edad");
		 while (!entrada.hasNextInt()) {
             System.out.println("Valor no válido");
             entrada.next();
             System.out.print("Introduce un número entero positivo: ");                               
      }
		 edad = entrada.nextInt();
		 if (edad>=18){
				System.out.println("Es mayor de edad");
			}else{
				System.out.println("Es menor de edad");    
			}
		 entrada.close();
		}
	}