public class Ques1_HashCodeInt {

    public static void main(String [] args){

        HashTable table2 = new HashTable(13);

        System.out.println("[main] For table2, Initial Size: "+table2.size()+" and Capacity: "+table2.capacity()+" HashCode: "+table2);

        int hash=table2.hash(100);
        System.out.println("Hash code of key is:"+hash);
    }
}
