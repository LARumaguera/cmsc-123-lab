import java.util.NoSuchElementException;

public class LinkedListIterator<E> implements Iterator<E> {
    LinkedListIterator(){}

    public class Node {
        E element;
        Node nextEl;

        Node(E element, Node nextEl) {
            this.element = element;
            this.nextEl = nextEl;
        }

        public Node getNextEl() {
            return nextEl;
        }

        public E getElement(){
            return element;
        }
    }

    public boolean hasNext(){
        Node head = null;
        Node current = head;
        if(current.getNextEl() == null){
            return false;
        } else {
            return true;
        }
    }

    public E next() throws Exception {
        Node head = null;
        Node current = head;
        if(hasNext() == true){
            current = current.getNextEl();
        }
        throw new Exception("No found element");
    }
}
