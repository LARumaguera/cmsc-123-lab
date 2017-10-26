
public class LinkedList<E> implements Collection<E> {

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

    public E getElement() {
      return element;
    }
  }

  Node head = null;
  int size = 0;

  public boolean add(E item) {
    Node newNode = new Node(item, head);
    head = newNode;
    size++;
    return true;
  }

  public boolean remove(int index) {
    if (this.size > 0) {
      Node current = head;
      Node previous = null;

      for (int i = 0; i < index; i++) {
        previous = current;
        current = current.nextEl;
      }

      previous.nextEl = current.nextEl;
      current.nextEl = null;
      size--;
      return true;
    }
    return false;
  }

  public int size(){
    return this.size;
  }

  public Iterator<E> iterator() {
    return new LinkedListIterator<E>();
  }

  public void display() {
    Node current = head;
    while(current != null){
      System.out.println(current.element);
      current = current.nextEl;
    }
  }
}
