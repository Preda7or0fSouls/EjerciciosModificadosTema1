package Ejercicios;
import java.util.Scanner;
public class Ejemplo7 {

	public static void main(String[] args) {
		float precio;
		float precioRebajado;
		
		 Scanner entrada = new Scanner( System.in );
		 
		 System.out.println("Introduce el precio del producto");
		 while (!entrada.hasNextFloat()) {
             System.out.println("Valor no válido");
             entrada.next();
             System.out.print("Introduce un número entero positivo: ");                               
      }
		 precio = entrada.nextFloat();
		 
		 System.out.println("Introduce el precio rebajado del producto");
		 while (!entrada.hasNextFloat()) {
             System.out.println("Valor no válido");
             entrada.next();
             System.out.print("Introduce un número entero positivo: ");                               
      }
		 precioRebajado = entrada.nextFloat();
		 
		 float descuento = ((precio-precioRebajado)/precio)*100;
		 System.out.println("El descuento es " + descuento+"%");

		 
	}

}
