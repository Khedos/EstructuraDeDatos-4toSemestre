package unidad2;

import java.util.Scanner;

public class recursividadSuma {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		//Suma la serie de numeros anteriores al numero ingresado
		int num;
		System.out.println("Ingrese un numero");
		num = scanner.nextInt();
		System.out.println(metodoRecursivo(num));
	}
	
	public static int metodoRecursivo(int num) {
		if(num == 0) {
			return 0;
		}
		
		return num-1+ metodoRecursivo(num-1);
		
	}
	
	/*public static int metodoRecursivo2(int num) {
		
	}
*/
}
