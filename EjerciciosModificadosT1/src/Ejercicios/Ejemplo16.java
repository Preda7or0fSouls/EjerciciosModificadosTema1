package Ejercicios;
import java.util.Scanner;


public class Ejemplo16 {
	public static void main(String argv[]) {
		int n;
		int m;
		char op;
		String cadena;

		System.out.println("Introduce un número entero:");


		Scanner inputValue;
		inputValue = new Scanner(System.in);
		n = inputValue.nextInt();

		System.out.println("Introduce otro número entero:");
		m = inputValue.nextInt();

		System.out.println("Introduce la operación a realizar (+, -, *, /):");

		cadena = inputValue.next();

		op = cadena.charAt(0);

		switch (op) {
		case '+':
			System.out.printf("El resultado de sumar %d y %d es: %d %n", n, m, n+m);
			break;
		case '-':
			System.out.printf("El resultado de restar %d y %d es: %d %n", n, m, n-m);
			break;
		case '*':
			System.out.printf("El resultado de multiplicar %d y %d es: %d %n", n, m, n*m);
			break;
		case '/':
			System.out.printf("El resultado de dividir %d y %d es: %d %n", n, m, n/m);
			break;
		default:
			System.out.println("Operación incorrecta");
		}


	}
}