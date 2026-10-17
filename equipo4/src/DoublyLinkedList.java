public class DoublyLinkedList <T> {
    // Es el inicio de la lista
    private DoublyNode<T> head;
    // Es el final de la lista
    private DoublyNode<T> tail;
    // Cantidad de nodos en la lista
    private int size;

    public DoublyLinkedList() {
        // Como es una lista vacía, no hay primer ni último nodo
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
    public void traverseBackward() {
        // Variable de trabajo LOCAL para empezar en el último nodo
        DoublyNode<T> current = tail;

        // Recorremos hacia atrás hasta pasar el primer nodo
        while (current != null) {
            System.out.print(current + ", ");
            // Retrocedemos current al nodo anterior
            current = current.getPrev();
        }

        System.out.println();
    }
}
