package datastructures.hashmap;

import datastructures.hashmap.HashMap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class HashMapTest {



    @Test
    void testHashKey(){
        HashMap sut = new HashMap<>(5);
        //sut.hash("hello");
        System.out.println(sut.hash("3"));


        //System.out.println(sut.get(1));
    }


    @Test
    void testHashSetKeyValue(){
        HashMap sut = new HashMap<>(5);

        sut.set("hello","world");

    }
}
