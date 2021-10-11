package Ejercicios;

import java.util.Scanner;

public class Ejemplo30 {
    static Scanner inputValue = new Scanner(System.in);
    public static String leerCadena(String mensaje){
        System.out.println(mensaje);
        return inputValue.nextLine();

    }
    public static void main(String[] args)
    {
    	boolean Palindromo = true;

        String cadena = leerCadena("Introduce una cadena");
        
	    for (int x = 0; x < (cadena.length() / 2); x++) {

	    	if (cadena.charAt(x) != cadena.charAt(cadena.length() - x - 1)) {
	    		Palindromo = false;
	    		break;
	    	}
	    }
	    if (Palindromo) {
	    	System.out.println("La cadena es palíndroma");
	    }else {
	    	System.out.println("La cadena NO es palíndroma");
	    }
	    inputValue.close();
    }
}