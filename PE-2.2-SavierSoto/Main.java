public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Lista vacia:" + list.isEmpty());

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtEnd(70);
        list.insertAtEnd(80);
        list.insertAtEnd(90);
        list.insertAtEnd(100);

        System.out.print("Lista creada:");
        list.display();

        System.out.println("Parte 2");
        System.out.println("Lista original\n");
        list.display();
        System.out.println("Lista reverse\n");
        list.reverse();
        list.display();

        DoublyLinkedList singlelist = new DoublyLinkedList();
        System.out.println("Un solo element (Caso borde)");
        singlelist.insertAtEnd(60);
        list.display();
        System.out.println("Reversa");
        singlelist.reverse();
        singlelist.display();

        System.out.println("Parte 3");
        System.out.println("Parte 3.1");
        System.out.println("Lista original");
        list.display();
        System.out.println("Nodo eliminado");
        list.deleteByValue(40);
        list.display();

    }
}