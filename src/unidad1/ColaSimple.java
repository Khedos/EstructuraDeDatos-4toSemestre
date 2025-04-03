package unidad1;

public class ColaSimple<T> {
    private T colaSimple[];
    private int cabeza = -1;
    private int cola = -1;
    private int maxSize;

    public ColaSimple(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("El tamaño máximo debe ser mayor que 0.");
        }
        this.maxSize = maxSize;
        colaSimple = (T[]) new Object[maxSize];
    }

    public boolean pop() {
        if (isEmpty()) {
            System.out.println("Cola vacía, no se pueden retirar datos.");
            return false;
        }
        
        
        T dato = colaSimple[cabeza];
        colaSimple[cabeza] = null; // Limpia la referencia
        if (cabeza == cola) { // Si se eliminó el último elemento
            cabeza = cola = -1;
        }
        else cabeza++;
        return true;
    }

    public boolean push(T dato) {
        if (isFull()) {
            System.out.println("Cola llena, no se pueden ingresar más datos.");
            return false;
        }

        if (isEmpty()) {
            cabeza = cola = 0;
        } 
        else {
            cola++;
        }

        colaSimple[cola] = dato;
        return true;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cola vacía, no hay datos para ver.");
        }
        return colaSimple[cabeza];
    }

    private boolean isEmpty() {
        return cola == -1;
    }

    private boolean isFull() {
        return cola == maxSize-1;
    }
}
