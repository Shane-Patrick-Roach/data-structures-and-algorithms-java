package codechallenges.repeatedWord;

import datastructures.hashmap.HashMap;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class RepeatedWord {


    public static String repeatedWord(String book){
        String[] words = book.replace(",","").replace(".","").toLowerCase(Locale.ROOT).split(" ");
        System.out.println(Arrays.toString(words));
        HashMap<Object, Object> hashMap = new HashMap<>(10);
        for (String word : words) {
            if (hashMap.contains(word)){
                return word;
            } else {
                hashMap.set(word,1);
            }
        }
        return null;
    }


    public static List<String> repeatedWordCount(String book){
        String[] words = book.replace(",","").replace(".","").toLowerCase(Locale.ROOT).split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>(10);
        for (String word : words) {
            if (hashMap.contains(word)) {
                Integer counter = hashMap.get(word);
                hashMap.set(word, counter + 1);
            } else {
                Integer counter = 1;
                hashMap.set(word, counter);
            }
        }

        return hashMap.keyAndValues();
    }
}
