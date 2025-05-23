package unidad2;

import java.util.Scanner;

public class problema2_RanaRecursiva {
static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*Hay una rana a la que le gusta mucho saltar, actualmente, se encuentra un poco lejos de su hogar,
		se sabe que la rana puede brincar hasta B metros por segundo y que su hogar se encuentra a M
		metros de ella, si esta no se cansara, ni tuviera inconvenientes en el camino, ¿cuál sería la cantidad
		mínima de segundos para llegar a su hogar saltando? Leerás B y M e imprimirás los segundos
		mínimos.*/
		
		float segundosMin = 0;
    	
    	System.out.println("Ingresar cuantos metros por segundos puede saltar la rana:");
        int saltoMetros = scanner.nextInt();
        
        System.out.println("Ingresar cuántos metros debe recorrer la rana hasta su hogar:");
        int hogarMetros = scanner.nextInt();
        
        float resultado = RanaRecursivaMetodo(saltoMetros, hogarMetros, segundosMin);
        System.out.println("La rana ocupa " + resultado + " segundos");
		
	}
	
	
	public static float RanaRecursivaMetodo(int saltoMetros, int hogarMetros, float segundosMin) {
			//Division perfecta
	        if (hogarMetros == 0) {
	            return segundosMin;
	        }
	        //corroborar que de exacto
	        if(hogarMetros < saltoMetros) {
	        
	        	return segundosMin + (float) hogarMetros/saltoMetros;
	 
	        }
	        	segundosMin++;
	            return RanaRecursivaMetodo(saltoMetros, hogarMetros-saltoMetros, segundosMin);
	        }
    }


