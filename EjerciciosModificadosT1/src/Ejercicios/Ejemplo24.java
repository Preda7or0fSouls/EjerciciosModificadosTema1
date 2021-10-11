package Ejercicios;
import java.util.Scanner;

public class Ejemplo24 {

    public static void main(String[] args)
    {	
		int nota;

		int cuantasNotas = 0;

		int sumaNotas = 0;

		boolean Diez = false;
		Scanner miScanner = new Scanner(System.in);
		
		System.out.println("Introduce las notas (enteros) (para acabar introduce un -1)");

		do{
			nota = miScanner.nextInt();
			if (nota != -1){
				sumaNotas += nota;
				cuantasNotas++;
				if (nota == 10) {

					Diez = true;
				}
			}

		}while ( nota != -1);
		
		System.out.println("La nota media es " + ((float)sumaNotas / (float)cuantasNotas));
		
		if (Diez) {
			System.out.println("Había al menos un 10 en las notas");
		}
		miScanner.close();
    }
}
