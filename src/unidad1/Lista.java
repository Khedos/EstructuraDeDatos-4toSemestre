package unidad1;

public class Lista {
	private Nodo cabeza;
	private int tamanio;
	
	public Lista() {
		this.cabeza = null;
		this.tamanio = 0;
	}
	
	public int get(int indice) {
		if(indice > tamanio || indice < 0) {
			return - 1;
		}
		Nodo nodo = cabeza;
		for(int i=0; i < indice; i++) {
			nodo = nodo.siguiente;
		}
		if(nodo == null) {
			return -1;
		}
		return nodo.val;
	}
	
	public void mostrar() {
		Nodo nodo = cabeza;
		for(int i=0; i< tamanio; i++) {
			System.out.print(nodo.val + " ");
			nodo = nodo.siguiente;
			
		}
	}
	
	public void insertarAlInicio(int val) {
		Nodo nodo = new Nodo(val);
		nodo.siguiente = cabeza;
		cabeza = nodo;
		tamanio++;	
	}
	
	public void insertarAlFinal(int val) {
		if(isEmpty()) {
			cabeza = new Nodo(val);
			tamanio++;
			return;
		}
		Nodo nodo = new Nodo(val);
		Nodo aux = cabeza;
		while(aux.siguiente != null) {
			aux = aux.siguiente;
		}
		aux.siguiente = nodo;
		tamanio++;
	}
	
	public void insertarEntreNodos(int indice, int val) {
		if(indice < 0 || indice > tamanio) {
			return;
		}
		Nodo nodo = new Nodo(val);
		if(isEmpty()) {
			cabeza = nodo;
			tamanio++;
			return;
		}
		Nodo aux = cabeza;
		for(int i = 0; i<indice; i++) {
			aux = aux.siguiente;
		}
		if(tamanio == indice) {
			aux.siguiente= nodo;
			tamanio++;
			return;
		}
		nodo.siguiente = aux.siguiente;
		aux.siguiente = nodo;
		tamanio++;
	}
	
	public void eliminar(int indice) {
		if(indice > tamanio || indice < 0 || isEmpty()) {
			return;
		}
		Nodo actual = cabeza;
		Nodo anterior = null;
		for(int i = 0; i < indice; i++) {
			anterior = actual;
			actual = actual.siguiente;
		}
		if(anterior == null) {
			cabeza = cabeza.siguiente;
			return;
		}
		
		anterior.siguiente = actual.siguiente;
		tamanio--;
		
	}
	
	public void eliminarAlFinal() {
		if(isEmpty()) {
			return;
		}
		Nodo anterior = cabeza;
		if(anterior.siguiente == null) {
			//solo hay un elemento
			cabeza = null;
			return;
		}
		while(anterior.siguiente.siguiente != null) {
			anterior = anterior.siguiente;
		}
		//eliminar actual
		anterior.siguiente = null;
		tamanio--;
	}
	
	public boolean isEmpty() {
		return cabeza == null;
	}

}
