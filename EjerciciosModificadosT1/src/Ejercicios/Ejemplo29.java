package Ejercicios;


public class Ejemplo29 {

	
    public static void main(String[] args)
    {	
		boolean Primo;
		for (int num = 3; num <=100; num+=2) {

			Primo = true;

		    for(int x=3; x <= (num / 2); x+=2) {
		        if(num %x ==0){
		        	Primo = false;
		        	break;
		        }
		    }
		    if (Primo) {
		    	System.out.println(num);
		    }
		}
    }
}
