public class Traverse {
    public class DoublyLinkedList<T> {
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

        // Recorre la lista de inicio a fin y muestra sus datos
        public void traverse() {
            // Variable de trabajo LOCAL para empezar en el primer nodo
            DoublyNode<T> current = head;

            // Recorremos hasta pasar el último nodo
            while (current != null) {
                System.out.print(current + ", ");
                // Avanzamos current al siguiente nodo
                current = current.getNext();
            }

            System.out.println();
        }

    }
}
