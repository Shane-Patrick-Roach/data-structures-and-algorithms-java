package codechallenges.animalShelter;

import codechallenges.psuedoQueue.PsuedoQueue;
import org.junit.jupiter.api.Test;

import java.util.zip.CheckedInputStream;

public class AnimalShelterTest {


    @Test
    void testAnimalShelterEnqueue() throws Exception {
        AnimalShelter sut = new AnimalShelter();
        Animal Ben = new Animal("dog");
        Animal Mike = new Animal("dog");
        Animal Sarah = new Animal("cat");
        Animal Sally = new Animal("cat");
        sut.enqueue(Sally);
        sut.enqueue(Ben);
        sut.enqueue(Mike);
        sut.enqueue(Sarah);
        sut.dequeue("cat");
        sut.dequeue("dog");
        sut.dequeue("dog");
        System.out.println(sut.stack2.top.value.type);
        System.out.println(sut.stack2.size);
    }



}
