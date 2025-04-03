package unidad2;

import java.util.Scanner;

public class RecursividadPotencia {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		//Muestra la potencia utilizando recursividad
		int base, potencia;
		System.out.println("Ingrese la base: ");
		base = scanner.nextInt();
		System.out.println("Ingrese la potencia: ");
		potencia = scanner.nextInt();
		System.out.println("La potencia "+base+" de "+potencia+" es:");
		System.out.println(recursividadPot(base, potencia));
		
		
		
	}
	
	public static int recursividadPot(int base, int potencia) {
		int respueta;
		if(potencia == 1) {
			return base;
		}
		if(potencia == 0) {
			return base = 1;
		}
		else {
			return base * recursividadPot(base, potencia-1);
			
		}
		
	}
	

}
