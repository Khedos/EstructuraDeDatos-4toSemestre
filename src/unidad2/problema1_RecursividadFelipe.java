package unidad2;

import java.util.Scanner;

public class problema1_RecursividadFelipe {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*Felipe acaba de terminar un semestre muy pesado, el muy despreocupado cargó N materias y está
		muy cansado para calcular su promedio a mano. Realiza un programa que le ayude a hacerlo,
		tienes que leer N y un arreglo de N elementos representando a las calificaciones del semestre de
		Felipe, tienes que imprimir al final el promedio calculado*/
		
		int n = scanner.nextInt();
		int [] matriz = new int [n];
		for(int i = 0; i<n; i++) {
			matriz[i] = scanner.nextInt();
		}	
		
		System.out.println(metodoRecursivo(matriz,0,0));

	}
		//3
	public static float metodoRecursivo(int [] matriz, int cont, float prom) {
		
		if(cont > matriz.length-1) {
			return prom/cont;
		}
		else {
			prom += matriz[cont];
			return metodoRecursivo(matriz, cont+1, prom);
		}
		
		
	}

}
