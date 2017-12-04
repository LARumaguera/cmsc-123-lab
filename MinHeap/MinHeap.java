class Heap {
  int maxCapacity;
  int size;
  int[] list;
  
  Heap(int maxCapacity) {
    this.size = 0;
    this.maxCapacity = maxCapacity;
    list = new int[maxCapacity];
  }
  
  void add(int item) {
    list[size] = item;
    size++;
    bubbleUp(item);
  }
  
  int bubbleUp(int item) {
    if(item == list[0]) {
      return item;
    }
    for(int i = 0; i < size; i++) {
      if(list[i] == item) {
        if(list[i] >= list[(i - 1) / 2]) {
          return item;
        }
        int temporary = list[(i - 1) / 2];
        list[(i - 1) / 2] = list[i];
        list[i] = temporary;
        return bubbleUp(list[(i - 1) / 2]);
      }
    }
    break;
  }
  
  int remove() {
    int top = list[0];
    list[0] = list[size - 1];
    size--;
    trickleDown(0);
    return top;
  }
  
  int bubbleDown(int index) {
    int indexRight = (2 * index + 2);
    int indexLeft = (2 * index + 1);
    int indexLastEl = size - 1;
    int indexLarge = index;
    
    if(indexLeft <= indexLastEl) {
      if(compare(list[indexLeft], list[index]) < 0) {
        indexLarge = indexRight;
      }
      if(indexLarge != index) {
        int temporary = list[index];
        list[index] = list[indexLarge];
        list[indexLarge] = temp;
        bubbleDown(indexLarge);
      }
      if(indexLeft <= indexLastEl) {
        if(compare(list[indexLarge], list[indexRight]) {
          indexLarge = indexRight;
        }
      }
    }
  }
   
  int compare(int x, int y){
    if(x < y) {
      return -1;
    } else if (x > y){
      return 1;
    } else {
      return 0;
    }
  }

  
  void preorder(int index) {
    if(index >= size) {
      return;
    }
    System.out.println(" "+ list[index]);
    preorder(2 * index + 1);
    preorder(2 * index + 2);
  }
  
  void inorder(int index) {
    if(index >= size) {
      return;
    }
    inorder(2 * index + 1);
    System.out.println(" "+ list[index]);
    preorder(2 * index + 2);
  }
  
  void postorder(int index) {
    if(index >= size) {
      return;
    }
     System.out.println(" "+ list[index]);
    preorder(2 * index + 1);
    preorder(2 * index + 2);
  }
  
  class MinHeap {
    public static void main(String[] args){
      Heap newHeap = Heap(5);
      
      newHeap.add(1);
      newHeap.add(4);
      newHeap.add(10);
      newHeap.add(11);
      newHeap.add(7);
      System.out.println();
      newHeap.preOrder(0);
      newHeap.inOrder(0);
      newHeap.postOrder(0);
    }
  }
}

