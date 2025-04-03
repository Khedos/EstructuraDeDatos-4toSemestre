package unidad2;

import java.util.Scanner;

public class recursividadSumaDosNumerosRecursiva{
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int num2=0, num1=0;
		System.out.println("Ingrese primer numero");
		num1 = scanner.nextInt();
		System.out.println("Ingrese segundo numero");
		num2 = scanner.nextInt();
		System.out.println(metodoRecursivo(num1, num2));
	}
	
	public static int metodoRecursivo(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}
        
        
        return metodoRecursivo(num1 + 1, num2 - 1);		
	}

}
