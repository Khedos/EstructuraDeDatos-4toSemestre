package unidad1;

public class ColaCircular<T> {
    private T[] colaCircular;
    private int cabeza;
    private int cola;
    private int maxSize;

    public ColaCircular(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("El tamaño máximo debe ser mayor que 0.");
        }
        this.maxSize = maxSize;
        colaCircular = (T[]) new Object[maxSize];
        cabeza = -1;
        cola = -1;
    }

    public boolean pop() {
        if (isEmpty()) {
            System.out.println("Cola vacía, no se pueden retirar datos.");
            return false;
        }

        colaCircular[cabeza] = null; // Elimina el elemento

        if (cabeza == cola) { // Si se eliminó el último elemento
            cabeza = cola = -1;
        } else {
            cabeza = (cabeza + 1) % maxSize; // Avanza circularmente
        }

        return true;
    }

    public boolean push(T dato) {
        if (isFull()) {
            System.out.println("Cola llena, no se pueden ingresar más datos.");
            return false;
        }

        if (isEmpty()) {
            cabeza = cola = 0;
        } else {
            cola = (cola + 1) % maxSize; // Avanza circularmente
        }

        colaCircular[cola] = dato;
        return true;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cola vacía, no hay datos para ver.");
        }
        return colaCircular[cabeza];
    }

    public boolean isEmpty() {
        return cabeza == -1;
    }

    public boolean isFull() {
        return (cola + 1) % maxSize == cabeza;
    }
}
