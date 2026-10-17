// Insertar un nodo al inicio
public void insertFirst(T data) {
    DoublyNode<T> newNode = new DoublyNode<>(data);

    // Si la lista está vacía, el nodo nuevo se vuelve head
    if (isEmpty()) {
        head = newNode;
        tail = newNode;
    } else {
        // El nuevo nodo apunta hacia adelante al que antes era el primero
        newNode.setNext(head);
        // El que antes era el primero ahora apunta hacia atrás al nuevo
        head.setPrev(newNode);
        // Ahora el nuevo nodo es el primero
        head = newNode;
    }