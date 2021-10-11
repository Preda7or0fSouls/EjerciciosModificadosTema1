package Ejercicios;

import java.util.Scanner;

public class Ejemplo28 {

	
    public static void main(String[] args)
    {	
		int num;
		boolean Primo = true;
		Scanner inputValue = new Scanner(System.in);
		
		System.out.println("Introduce un número entero positivo:");
		
		num = inputValue.nextInt();
		if ((num == 1) || ((num != 2 ) && (num % 2 == 0))) {
			Primo = false;
		}else{

		    for(int x=3; x <= (num / 2); x+=2) {
		        if(num %x ==0){
		        	Primo = false;
		        	break;
		        }
		    }
	    
		}
	    if (Primo) {
	    	System.out.println("El número " + num + " es primo");
	    }else {
	    	System.out.println("El número " + num + " NO es primo");
	    }
		inputValue.close();
    }
}
