package unidad2;

import java.util.Scanner;

public class RecursividadMulti {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		//Muestra una tabla de multiplicar
		int num, x;
		System.out.println("Ingrese un numero: ");
		num = scanner.nextInt();
		System.out.println("Ingrese un numero: ");
		x = scanner.nextInt();
		recursividadMulti(num, x);
		
		
		
}

	public static void recursividadMulti(int num, int x) {
		if(x==0) {
			return;
		}
		else {
			System.out.println(num + " X "+ x +" = "+ num*x );
			 recursividadMulti(num, x-1);
		}
		
	}
	

}
