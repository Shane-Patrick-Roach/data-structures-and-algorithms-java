package codechallenges.repeatedWord;

import codechallenges.repeatedWord.RepeatedWord;
import org.junit.jupiter.api.Test;

import static codechallenges.repeatedWord.RepeatedWord.repeatedWord;
import static codechallenges.repeatedWord.RepeatedWord.repeatedWordCount;

public class RepeatedWordTest {


    @Test
    void testRepeatedWordsShortString(){
        String book = "Once upon a time, there was a brave princess who...";
        assert (repeatedWord(book).equals("a"));
    }

    @Test
    void testRepeatedWordsMediumString(){
        String book = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assert (repeatedWord(book).equals("summer"));
    }

    @Test
    void testRepeatedWordsLongString(){
        String book = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        assert (repeatedWord(book).equals("it"));
    }


    @Test
    void testRepeatedWordsLongestString(){
        String book = "Roger gathered a handful of stones and began to throw them. Yet there was a space round Henry, perhaps six yards in diameter, into which he dare not throw. Here, invisible yet strong, was the taboo of the old life. Round the squatting child was the protection of parents and school and policemen and the law.";
        assert (repeatedWord(book).equals("a"));
    }

    @Test
    void testRepeatedWordsEmpty(){
        String book = " ";
        assert (repeatedWord(book) == null);
    }

    @Test
    void testRepeatedWordsCounter(){
        String book = "Once upon a time, there was a brave princess who...";
        assert (repeatedWordCount(book).toString().equals("[Word: upon - Count: 1, Word: once - Count: 1, Word: time - Count: 1, Word: was - Count: 1, Word: princess - Count: 1, Word: who - Count: 1, Word: there - Count: 1, Word: a - Count: 2, Word: brave - Count: 1]"));

    }

    @Test
    void testRepeatedWordsCounterSameString(){
        String book = "hello, hello, hello hello hello hello hello hello hellohello hello hello hello hello hello hello hello hello v v hello hello";
        assert (repeatedWordCount(book).toString().equals("[Word: hello - Count: 18, Word: hellohello - Count: 1, Word: v - Count: 2]"));
    }
}
