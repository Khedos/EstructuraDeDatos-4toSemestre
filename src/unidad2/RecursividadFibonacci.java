package unidad2;

import java.util.Scanner;

public class RecursividadFibonacci {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		//Fibonacci
		int num;
		System.out.println("Ingrese un numero");
		num = scanner.nextInt();
		//System.out.println(metodoRecursivo(num));
		for(int i=0; i<num; i++) {
			System.out.println(metodoRecursivo(i));
		}
		

	}
	
	public static int metodoRecursivo(int num){
		if(num <= 1) {
			return num;
		}
		
		return metodoRecursivo(num-1) + metodoRecursivo(num-2);
	}

}