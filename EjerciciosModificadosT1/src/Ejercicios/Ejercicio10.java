package Ejercicios;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		   Scanner entrada=new Scanner(System.in);
     int num;
     System.out.println("Ingrese un numero");
     while (!entrada.hasNextInt()) {
         System.out.println("Valor no válido");
         entrada.next();
         System.out.print("Introduce un número: ");                               
  }
     num = entrada.nextInt();
     if(num>0){
       System.out.println("El : " +num +" es un numero positivo");
     }else{
     System.out.println("el : " +num + " es un numero negativo");
     }
     entrada.close();
	}
}
