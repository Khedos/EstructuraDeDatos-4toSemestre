package unidad1;

import java.util.Scanner;

public class RecursividadExamern {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
		System.out.println("Escribir n: ");
		int n = scanner.nextInt();
		System.out.println("Escribir m: " );
		int m = scanner.nextInt();
		int matriz[][]= new int [n][m];
		//metodoRecursivo(n,m);
		for(int r = 0; r < n; r++) {
			for(int c = 0; c < m; c++) {
				matriz[r][c] =  c;
				System.out.print(matriz [r][c]);
			}
			System.out.println();
		}
		System.out.println(metodoRecursivo(matriz,0,0)); 
		
		
	}
	
	public static int [][] metodoRecursivo(int[][] matriz,int r, int c) {
		if(r < matriz.length) {
			if(c < matriz[r].length) {
				//iterar todas las columnas de r
				System.out.print(matriz[r][c]);
				return metodoRecursivo(matriz,r,c+1);
			}
			//c debe reinicarse a 0
			else {
				System.out.println();
				//al c dejar de iterar sobre las columnas cambia de r
				return metodoRecursivo(matriz,r+1,c=0);
			}
		}
		//progra q finaliza;
		//return  matriz = [0][]0;
		return matriz;
	}
}

