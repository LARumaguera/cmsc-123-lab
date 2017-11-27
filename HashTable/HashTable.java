public class HashTable {
    class hashValue {
        int value;
        String key;

        hashValue(int value, String key) {
            this.value = value;
            this.key = key;
        }

    }

    int HASH_TABLE_CAPACITY;
    hashValue [] hashTableValue;
    int size;

    HashTable() {
        HASH_TABLE_CAPACITY = 20;
        hashTableValue = new hashValue[HASH_TABLE_CAPACITY];

        for(int i = 0; i < HASH_TABLE_CAPACITY; i++) {
            hashTableValue = null;
        }
    }

    public int getHashValue(String key){
        int hashCode = key.hashCode();
        int hashValue= hashCode % HASH_TABLE_CAPACITY;
        return hashValue;
    }

    public void put(int value, String key) {
        int hashValue = getHashValue(key) % HASH_TABLE_CAPACITY;

        if(hashTableValue[hashValue] == null) {
            hashTableValue[hashValue] == new HashTable(value, key);
        } else {
            hashValue hash1 = hashTableValue[hashValue];
            while(hash1.key == key){
                hash1.value = value;
            } if (hash1.next != null && hash1.key != key) {
                hash1 = hash1.next;
            } else {
                hash1.next = new hashValue(value, key);
            }
        }
        size++;
    }

    public int get(String key){
        int hash = getHashValue(key) % HASH_TABLE_CAPACITY;

        if(hashTableValue[hash] == null){
            hashValue curr1 = hashTableValue[hash];

            while(curr1.key!= key && curr1.next != null){
                curr1 = curr1.next;
            }

            if(curr1.key == null){
                return 0;
            }
            return curr1.value;
        }
    }

    public int remove(String key){
        int hash = getHashValue(key) % HASH_TABLE_CAPACITY;

        if(hashTableValue[hash] == null){
            return 0;
        }

        hashValue prev = null;
        hashValue curr = hashTableValue[hash];

        while(curr.key != key && curr.next !=null){
            prev = curr;
            curr.next = curr;
        }

        if(prev == null) {
            hashTableValue[hash] = curr.next;
        }

        if(curr.key == null){
            return 0;
        } else {
            pre.next =curr.next;
        }

        size--;
        return curr.value;
    }

    public boolean contains(String key){
        int hash = getHashValue(key) % HASH_TABLE_CAPACITY;

        if(hashTableValue[hash] == null){
            return false;
        }

        hashValue curr = hashTableValue[hash];
        while(curr.key != null && curr.next != null){
            curr.next = curr;
        }

        if(curr.key == null){
            return false;
        }
        return true;
    }

    public void values(){
        for(int i = 0; i < HASH_TABLE_CAPACITY; i++){
            hashValue curr = hashTableValue[i];
            while(curr != null){
                System.out.println(curr.value);
                curr = curr.next;
            }
        }
    }

    public void keys() {
        for (int i = 0; i < HASH_TABLE_CAPACITY; i++) {
            hashValue curr = hashTableValue[i];
            while (curr != null) {
                System.out.println(curr.value);
                curr = curr.next;
            }
        }
    }

    public void display(){
        for(int i = 0;i < HASH_TABLE_CAPACITY; i++){
            System.out.println(i + 1 + ":");
            hashValue curr = hashTableValue[i];
            while (curr != null){
                System.out.println(curr.value + "");
                curr = curr.next;
            }
        }
    }
}
