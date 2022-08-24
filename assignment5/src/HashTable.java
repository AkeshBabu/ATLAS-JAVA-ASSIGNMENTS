public class HashTable {

    int capacity;
    int size;

    Object[] buckets;

    public HashTable(){
        //capacity = 10;
        //buckets = new Object[capacity];
        //print("Created with default Size of 10");
        this(10); // Executing Parameterized Constructor to create HashTable with capacity of 10 bucket as default capacity
    }


    public HashTable(int capacity) {
        this.capacity = capacity;
        buckets = new Object[capacity];
        size = 0;
        System.out.println("Created HashTable with Capacity of "+capacity+" at "+buckets);
    }


    int hash(Integer key) {
        int hashCode = key % capacity;
        return hashCode;
    }

    int size() {
        return size;
    }

    int capacity() {
        return capacity;
    }


}
