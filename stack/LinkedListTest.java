import junit.framework.TestCase;

public class LinkedListTest extends TestCase {
  LinkedList item = new LinkedList();

  public void testAdd() {
    assertEquals(true, item.add("Soap"));
    assertEquals(true, item.add(7));
    assertEquals(true, item.add(1));
    assertEquals(true, item.add("Shampoo"));
    item.display();
  }

  public void testRemove() {
    item.add(1);
    item.add(7);
    item.add("Soap");

    assertEquals(true, item.remove(2));
  }
}
