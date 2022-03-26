package datastructures.hashmap;

import org.junit.jupiter.api.Test;

public class HashMapTest {


    @Test
    void testHashMapSetSize(){
        HashMap<String,String> sut = new HashMap<>(5);
        assert(sut.size == 5);
    }


    @Test
    void testHashKey(){
        HashMap<String,String> sut = new HashMap<>(5);
        assert(sut.hash("3") == 1);
    }


    @Test
    void testHashSetSingleKeyValue(){
        HashMap<String,String> sut = new HashMap<>(2);

        sut.set("hello","world");

        assert(sut.bucketArrayList.get(0).size() == 1);
    }


    @Test
    void testHashSetMultipleKeyValue(){
        HashMap<String,String> sut = new HashMap<>(2);

        sut.set("hello","world");
        sut.set("no", "thankyou");
        sut.set("tree", "thankyou");
        sut.set("hel","no");
        sut.set("hell","no");
        sut.set("hel","no");
        sut.set("rock","stone");

        assert (sut.bucketArrayList.get(1).size() == 4);
    }

    @Test
    void testHashGetKeyValue(){
        HashMap<String,String> sut = new HashMap<>(2);
        sut.set("hello","world");
        sut.set("no", "thankyou");
        assert (sut.get("hello").equals("world"));
    }


    @Test
    void testHashGetKeyValueNegative(){
        HashMap<String,String> sut = new HashMap<>(2);
        sut.set("hello","world");
        assert (sut.get("Hello") == null);
    }


    @Test
    void testHashMapContainsKey(){
        HashMap<String,String> sut = new HashMap<>(2);
        sut.set("hello","world");
        assert (sut.contains("hello"));
    }

    @Test
    void testHashMapContainsKeyNegative(){
        HashMap<String,String> sut = new HashMap<>(2);
        sut.set("hello","world");
        assert (!sut.contains("Hello"));
    }



    @Test
    void testHashMapCollectionKeys(){
        HashMap<String,String> sut = new HashMap<>(2);
        sut.set("hello","world");
        sut.set("no", "thankyou");
        sut.set("what","aasd");
        assert (sut.keys().toString().equals("[hello, what, no]"));
    }


    @Test
    void testHashMapCollectionKeysDuplicates(){
        HashMap<String,String> sut = new HashMap<>(2);
        sut.set("hello","world");
        sut.set("hello","world");
        sut.set("no", "thank you");
        sut.set("no", "thank you");
        sut.set("what","no");
        sut.set("what","not");
        assert (sut.keys().toString().equals("[hello, what, no]"));
    }
}
