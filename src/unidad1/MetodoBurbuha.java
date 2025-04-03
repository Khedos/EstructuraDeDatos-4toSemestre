package unidad1;
import java.util.Scanner;

public class MetodoBurbuha {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int [] arreglo;
		int n;
		
		System.out.println("Indique el tamanio del arreglo: ");
		n = scanner.nextInt();
		arreglo = new int [n];
		
		for(int i=0; i<arreglo.length; i++) {
			arreglo[i] = scanner.nextInt();
		}
		
		System.out.println();
		System.out.print("Arreglo sin ordenar: ");
		for(int numeros: arreglo) {
			System.out.print(numeros + " ");
		}
		
		ordenamientoBurbuja(arreglo);
		

	}
	
	public static int [] ordenamientoBurbuja(int [] arreglo) {
		for(int i = 0; i <arreglo.length - 1; i++) {
			
			for(int j=0; j< arreglo.length-1-i; j++) {
				if(arreglo[j] > arreglo[j+1]) {
					int temp = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = temp;
					}
			}
		}
		return arreglo;
	}

}
