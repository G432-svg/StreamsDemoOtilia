package be.intecbrussel.DemoStream;
import java.util.Arrays;

import java.util.stream.Stream;

public class DogApp {

    public static void main(String[] args) {
        Dog [] dogs;
        dogs = new Dog[]{new Dog("Fido", 5, true),new Dog("Fido", 1, false),new Dog("Rex", 15, true)};

        Dog[] chosenDogs = Stream.of(dogs)
                .map(dog -> dog.setVaccinated(true))
                .filter(Dog::isVaccinated)
//                .filter(DogApp::test)
                .toArray(Dog[]::new);
        System.out.println(Arrays.toString(chosenDogs));
    }

//    private static boolean test(Boolean dog) {
//        return dog.getAge() > 2 && dog.getAge() < 10;
//    }
}
