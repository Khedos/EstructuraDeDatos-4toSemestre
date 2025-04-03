package unidad1;

public class Pila <T>{
	
	private T pila [];
	private int maxSize;
	private int top;
	
	public Pila(int maxSize) {
		if(maxSize < 0) {
			throw new IllegalArgumentException("El tamanio de la pila pila debe ser mayor a cero");
		}
		this.maxSize = maxSize;
		pila = (T[]) new Object[maxSize];
		top = -1;
	}
	
	public T pop() {
		T dato = null;
		if(!isEmpty()) {
			dato = pila[top];
			top--;
		}
		else {
			System.out.println("Pila vacia, no se pueden eliminar datos.");
		}
		return dato;
		
	}
	
	public boolean push (T dato) {
		if(!isFull()) {
			top++;
			pila[top] = dato;
			return true;
		}
			System.out.println("Pila llena, no se pueden ingresar mas datos.");
			return false;
	}
	
	public void printPila() {
		if(isEmpty()) {
			System.out.println("La pila no se puede mostrar por que no hay elementos en ella.");
		}
		else {
			System.out.println("Elementos de la pila");
			for(int i = top; i>=0; i--) {
				System.out.println(pila[i]);
			}
		}
		
	}
	
	public boolean isEmpty() {
		return top == -1;
		
	}
	
	public boolean isFull() {
		return top == maxSize -1;
	}
}