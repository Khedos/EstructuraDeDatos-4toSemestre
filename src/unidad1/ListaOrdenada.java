package unidad1;

public class ListaOrdenada {
	private NodoP cabeza;
	private int tamanio;
	
	public ListaOrdenada() {
		this.cabeza = null;
		this.tamanio = 0;
	}
	
	public void insertarOrdenada(int val){
		NodoP nodo = new NodoP(val);
		if(isEmpty()) { 
			cabeza = nodo;
			tamanio++;
			return;
		}
		if(val< cabeza.val) { 
			nodo.siguiente = cabeza;
			cabeza = nodo;
			tamanio++;
			return;
		}
		NodoP aux = cabeza;
		while(aux.siguiente != null && aux.siguiente.val< val){
			aux = aux.siguiente;
		}
		nodo.siguiente = aux.siguiente;
		aux.siguiente = nodo;
		tamanio++;	
	}
	
	public void mostrar() {
		NodoP nodo = cabeza;
		for(int i=0; i< tamanio; i++) {
			System.out.print(nodo.val + " ");
			nodo = nodo.siguiente;
			
		}
	}
	
	
	public boolean isEmpty() {
		return cabeza == null;
	}

}
