
public class Stack<E>  {
    LinkedList<E> stack;

    public Stack(){
        stack = new LinkedList();
    }

    public void push(E item){
        int index = stack.size();
        stack.add(item, index);
    }

    public E pop(){
        int index = stack.size() - 1;
        return stack.remove(index);
    }

    public boolean isEmpty() {
        return (stack.size() == 0);
    }

    public E peek(){
        if(isEmpty()) {
            return null;
        } else {
            int index = stack.size() - 1;
            return stack.getList(index);
        }
    }

    public int size() {
        return stack.size();
    }
}

class stackTest {
    public static void main(String[] args){
        Stack newStack = new Stack();
        Integer a = new Integer(7);
        Integer b = new Integer(11);
        Integer c = new Integer(23);

        newStack.push(a);
        newStack.push(b);
        newStack.push(c);
        newStack.pop();
        newStack.peek();

    }
}
