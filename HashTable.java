import java.util.*;

public class HashTable {
    public static void main(String[] args) {

        // Entry<K,V> key.hashCode() %capacity HashTable
        // Indexes: values upon same index, a linked list is created
        // ------------------------------------------------------------------------------------------------------------------------------------------
        // "100", "arden" 100.hashCode() %10= 0 0 k: 100, v: arden --> k: 320, v: david
        // "101", "brian" 101.hashCode() %10 = 1 1 k: 101, v: brian
        // "102", "charlie" 102.hashCode() %10 = 2 2 k: 102, v: charlie
        // "320", "david" 320.hashCode() %10 = 0 3
        // 4
        // 5
        // 6
        // 7
        // 8
        // 9

        // the parameter is the capacity of the HashTable
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "arden");
        table.put(101, "brian");
        table.put(102, "charlie");
        table.put(320, "david");

        for(Integer key: table.keySet()){
            System.out.println("Key: " + key + " hash code: " + table.hashCode()%10 + " Value: " + table.get(key));
        }
    }
}