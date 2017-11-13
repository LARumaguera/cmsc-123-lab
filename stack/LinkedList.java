
public class LinkedList<E> implements Collection<E> {

    public class Node {
        Object element;
        Node nextEl;

        Node(Object element, Node nextEl) {
            this.element = element;
            this.nextEl = nextEl;
        }
    }

    Node head = null;
    int size = 0;

    public boolean add(E item, int index) {
        Node newNode = new Node(item, head);
        if (this.size == 0 || index == 0) {
            this.head = newNode;
            size++;
            return true;
        }

        Node curNode = this.head;
        Node lastNode = null;
        for (int i = 0; i < index; i++) {
            lastNode = curNode;
            curNode = curNode.nextEl;
        }

        newNode.nextEl = curNode;
        lastNode.nextEl = newNode;
        return true;
    }

    public E remove(int index) {
        if (this.size == 0) {
            return null;
        }
        Node curNode = this.head;
        Node lastNode = curNode;
        while (curNode.nextEl != null) {
            if (this.equals(curNode.element)) {
                lastNode.nextEl = curNode.nextEl;
                curNode.nextEl = null;
                size--;
            }
            lastNode = curNode;
            curNode = curNode.nextEl;
        }
        return null;
    }

    public E getList(int index) {
        Node curNode = this.head;
        for(int i = 0; i < index; i++) {
            curNode = curNode.nextEl;
            if(curNode == null){
                throw new NullPointerException("No element");
            }
        }
        return (E) curNode.element;
    }


    public int size() {
        return this.size;
    }

    public Iterator<E> iterator() {
        return new LinkedListIterator<E>();
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.nextEl;
        }
    }
}
