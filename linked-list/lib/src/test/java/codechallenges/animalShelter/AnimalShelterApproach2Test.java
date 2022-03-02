//package codechallenges.animalShelter;
//
//import org.junit.jupiter.api.Test;
//
//public class AnimalShelterApproach2Test {
//
//    @Test
//    void testAnimalShelterEnqueue() throws Exception {
//        AnimalShelterApproach2<Animal> sut = new AnimalShelterApproach2<>();
//        Dog Ben = new Dog("dog","Ben");
//        Cat Sally = new Cat("cat", "Sally");
//        Cat WonderCat = new Cat("cat", "Wonder-Cat");
//        Cat Chris = new Cat("dog", "Chris");
//        sut.enqueue(Chris);
//        sut.enqueue(WonderCat);
//        sut.enqueue(Sally);
//        sut.enqueue(Ben);
//        sut.dequeue("cat");
//        sut.dequeue("asd");
//        System.out.println(sut.queue1.front.value.name);
//        System.out.println(sut.queue1.size);
//    }
//}
