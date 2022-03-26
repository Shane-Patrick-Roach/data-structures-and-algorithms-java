package datastructures.hashmap;

import datastructures.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// NOTE: Does NOT preserve insertion order!
// WARNING: Don't make K an Object or Character!
public class HashMap<K, V>
{
    ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;  // using ArrayList instead of array so we can instantiate with a parameterized type
    int size;

    public HashMap(int size)
    {
        if (size < 1)
        {
            throw new IllegalArgumentException("HashMap size must be 1 or greater!");
        }

        this.size = size;
        this.bucketArrayList = new ArrayList<>(size);

    }


    public void set(K key, V value) {
        int index = hash((String) key);
        LinkedList<HashMapPair<K,V>> links = bucketArrayList.get(index);

        if(links == null){
            links = new LinkedList<>();
            bucketArrayList.add(index, links);
            links.add(new HashMapPair<K,V>(key, value));
        }
        for (HashMapPair<K,V> pair: links){
            if (pair.getKey() == key){
                pair.setValue(value);
            }
        }
    }

    public V get(K key)
    {
        // TODO: implement me
        return null;
    }

    public boolean contains(K key)
    {
        // TODO: implement me
        return false;
    }

    public List<K> keys()
    {
        // TODO: implement me
        return null;
    }

    // Sometimes hashCode in Java can be negative! So we need to do absolute value
    // If you really want to hash things yourself, look at https://stackoverflow.com/a/113600/16889809
    // Don't use Character! Don't use Object! Don't use any object you have not overridden equals() and hashCode() on!
    // If you do this, things that should collide, won't, because Object.hashCode() is not good
    // Protip: Testing collisions is easy with Integer, because Integer hashes to its own value


    public int hash(String key) {
//        int total = 0;
//        int PRIME = 31;
//        for (int i = 0; i < key.length(); i++) {
//            char character = key.charAt(i);
//            int value = (int) character - 96;
//            System.out.println(value);
//            total = total + value;
//        }
        //return total;
        return Math.abs(key.hashCode()) % size;
    }

}