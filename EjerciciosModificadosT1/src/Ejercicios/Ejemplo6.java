package Ejercicios;
import java.util.Scanner;
public class Ejemplo6 {

	    public static void main( String[] args )
	    {
	        int radio; 
	        
	        
	        Scanner entrada = new Scanner( System.in );
	        
	    
	        System.out.print( "Introduce el radio de la circunferencia: ");
	        while (!entrada.hasNextInt()) {
                System.out.println("Valor no válido");
                entrada.next();
                System.out.print("Introduce un número entero: ");                               
         }
	        radio = entrada.nextInt();
	        	        
	        System.out.printf( "\nLa altura es  es: %f.", ( 2 * Math.PI * radio ) );
	        
	       
	        System.out.printf( "\nEl área es: %f.\n", ( Math.PI * radio * radio ) );
	        
	        System.exit(0);
	  
	
	}

}
