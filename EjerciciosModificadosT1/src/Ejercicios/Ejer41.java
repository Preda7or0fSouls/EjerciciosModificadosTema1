package Ejercicios;
import java.util.Scanner;
public class Ejer41 {

	public static void main(String[] args) {
		 int y,z,j;
	        y=1;
	        z=1;

	        System.out.print(y + " ");
	        for(j=1;j<=40;j++){
	            System.out.print(z + " ");
	            z = y + z;
	            y = z - y;
	        }
	        System.out.println("<-- Estos son  40 primeros términos de la serie de Fibonacci" );
	}
}


/*import java.util.*;
import java.lang.*;

class Rextester {
    
    public static void main(String args[]) {
        final int n = 40;
        int i = 0;
        int j = 1;
        double aureo = 1;
        System.out.println("fibonacci(0) = 0");
        System.out.println("fibonacci(1) = 1");

        for(int k=2; k<n; k++) {
            int t = i + j;
            if(i!=0) {
                aureo = (double)j/(double)i;
                System.out.println(
                    "phi = ("+j+"/"+i+") = " + aureo);
            }
            System.out.println(
                "fibonacci("+ k + ") = " + t);
            i = j;
            j = t;
        }
        System.out.println("");
    }
}
*/