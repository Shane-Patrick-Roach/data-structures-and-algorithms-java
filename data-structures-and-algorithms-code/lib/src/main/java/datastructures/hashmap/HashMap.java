package datastructures.hashmap;

import datastructures.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<K, V>
{
    ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;
    int size;

    public HashMap(int size)
    {
        if (size < 1)
        {
            throw new IllegalArgumentException("HashMap size must be 1 or greater!");
        }

        this.size = size;
        this.bucketArrayList = new ArrayList<>(size);

        for (int i = 0; i < this.size; i++)
        {
            bucketArrayList.add(i, new LinkedList<>());
        }
    }


    public void set(K key, V value) {
        int index = hash((K) key);

        LinkedList<HashMapPair<K,V>> list = bucketArrayList.get(index);

        if(list.size() != 0){
            for (HashMapPair<K,V> pair : list){
                if (pair.getKey().equals(key)){
                    pair.setValue(value);
                    return;
                }
            }
            list.add(new HashMapPair<>(key, value));
        } else {
            list.add(new HashMapPair<>(key, value));
        }
    }

    public V get(K key)
    {
        int index = hash((K) key);
        LinkedList<HashMapPair<K,V>> list = bucketArrayList.get(index);

        for (HashMapPair<K,V> pair : list){
            if (pair.getKey().equals(key)){
                return pair.getValue();
            }
        }
        return null;
    }

    public boolean contains(K key)
    {
        int index = hash((K) key);
        LinkedList<HashMapPair<K,V>> list = bucketArrayList.get(index);

        for (HashMapPair<K,V> pair : list){
            if (pair.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    public List<K> keys()
    {
        List<K> keysList = new ArrayList<>();
        for (LinkedList<HashMapPair<K, V>> list : bucketArrayList) {
            for (HashMapPair<K, V> pair : list) {
                keysList.add(pair.getKey());
            }
        }
        return keysList;
    }


    public List<String> keyAndValues()
    {
        List<String> keysList = new ArrayList<>();
        for (LinkedList<HashMapPair<K, V>> list : bucketArrayList) {
            for (HashMapPair<K, V> pair : list) {
                String build = "Word: " + pair.getKey().toString() + " - Count: " + pair.getValue().toString();
                keysList.add(build);
            }
        }
        return keysList;
    }

    // Sometimes hashCode in Java can be negative! So we need to do absolute value
    // If you really want to hash things yourself, look at https://stackoverflow.com/a/113600/16889809
    // Don't use Character! Don't use Object! Don't use any object you have not overridden equals() and hashCode() on!
    // If you do this, things that should collide, won't, because Object.hashCode() is not good
    // Protip: Testing collisions is easy with Integer, because Integer hashes to its own value


    public int hash(K key) {
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