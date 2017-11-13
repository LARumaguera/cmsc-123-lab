public class Queue {
    int length;
    int front;
    int rear;
    int[] items;
    int size;

    Queue(int length){
        this.size = size;
        this.front = front;
        this.rear = rear;
        this.length = length;
        this.items = new int[this.length];
    }

    public void enqueue(int item){
        if(size == length){
            expandArray();
        }
        items[rear] = item;
        rear = ((rear + 1) % this.length);
        size++;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int dequeue() {
        if(isEmpty()){
            return 0;
        } else {
            items[front] = front;
            front = (front + 1) % this.length;
        }
        return front;
    }

    public int peek() {
        if(isEmpty()){
            return 0;
        } else {
            return items[front];
        }
    }

    public int size() {
        return this.length;
    }

    public void expandArray() {
        this.length *= 2 ;
        int[] newItems = new int[this.length];
        for (int i = 0; i <this.size; i++){
            newItems[i] = items[front];
            front = (front + 1) * this.length;
        }

        front = 0;
        rear = this.size;
        items = newItems;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(items[i]);
        }
    }
}

class testQueue {

    public static void main(String[] args){
        Queue newQueue = new Queue(5);

        newQueue.enqueue(1);
        newQueue.enqueue(4);
        newQueue.enqueue(2);
        newQueue.enqueue(7);
        newQueue.enqueue(11);
        newQueue.display();

        newQueue.enqueue(3);
        newQueue.display();

        newQueue.dequeue();
        newQueue.display();

    }
}
