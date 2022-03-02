package codechallenges.animalShelter;

import codechallenges.psuedoQueue.PsuedoQueue;
import org.junit.jupiter.api.Test;

import java.util.zip.CheckedInputStream;

public class AnimalShelterTest {


    @Test
    void testAnimalShelterEnqueue() throws Exception {
        AnimalShelter sut = new AnimalShelter();
        Animal Ben = new Animal("dog", "ben");
        Animal Mike = new Animal("dog", "mike");
        Animal Sarah = new Animal("cat", "sarah");
        Animal Sally = new Animal("cat", "sally");
        sut.enqueue(Sally);
        sut.enqueue(Ben);
        sut.enqueue(Mike);
        sut.enqueue(Sarah);
        assert(sut.stack2.size == 4);
    }


    @Test
    void testAnimalShelterDequeueFirstCat() throws Exception {
        AnimalShelter sut = new AnimalShelter();
        Animal Ben = new Animal("dog", "ben");
        Animal Mike = new Animal("dog", "mike");
        Animal Sarah = new Animal("cat", "sarah");
        Animal Sally = new Animal("cat", "sally");
        sut.enqueue(Sally);
        sut.enqueue(Ben);
        sut.enqueue(Mike);
        sut.enqueue(Sarah);
        assert(sut.dequeue("cat").toString().equals("Animal{type='cat', name='sally'}"));
    }


    @Test
    void testAnimalShelterDequeueFirstDog() throws Exception {
        AnimalShelter sut = new AnimalShelter();
        Animal Ben = new Animal("dog", "ben");
        Animal Mike = new Animal("dog", "mike");
        Animal Sarah = new Animal("cat", "sarah");
        Animal Sally = new Animal("cat", "sally");
        sut.enqueue(Sally);
        sut.enqueue(Ben);
        sut.enqueue(Mike);
        sut.enqueue(Sarah);
        assert(sut.dequeue("dog").toString().equals("Animal{type='dog', name='ben'}"));
    }

    @Test
    void testAnimalShelterDequeueMultipleDogs() throws Exception {
        AnimalShelter sut = new AnimalShelter();
        Animal Ben = new Animal("dog", "ben");
        Animal Mike = new Animal("dog", "mike");
        Animal Sarah = new Animal("cat", "sarah");
        Animal Sally = new Animal("cat", "sally");
        sut.enqueue(Sally);
        sut.enqueue(Ben);
        sut.enqueue(Mike);
        sut.enqueue(Sarah);
        sut.dequeue("dog");
        assert(sut.dequeue("dog").toString().equals("Animal{type='dog', name='mike'}"));
    }



    @Test
    void testAnimalShelterDequeueReturnNull() throws Exception {
        AnimalShelter sut = new AnimalShelter();
        Animal Ben = new Animal("dog", "ben");
        Animal Mike = new Animal("dog", "mike");
        Animal Sarah = new Animal("cat", "sarah");
        Animal Sally = new Animal("cat", "sally");
        sut.enqueue(Sally);
        sut.enqueue(Ben);
        sut.enqueue(Mike);
        sut.enqueue(Sarah);
        assert(sut.dequeue("lizard") == null);
    }
}
