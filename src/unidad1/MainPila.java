package unidad1;

public class MainPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila <Integer> pila = new Pila <>(5);
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		pila.push(5);
		pila.pop();
		pila.push(5);
		pila.printPila();
		
		

	}
}
