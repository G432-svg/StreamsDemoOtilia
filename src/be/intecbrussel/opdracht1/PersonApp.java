package be.intecbrussel.opdracht1;
import be.intecbrussel.Gender;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PersonApp {
    public static void main(String[] args) {
//        Random random = new Random();
//
//        if (random.nextInt() % 2 == 2)

        Person[] people = {new Person("Jef", "Blum", Gender.MALE, 23, 78.3F, 176.2F ),new Person("Laura","Perez",Gender.FEMALE, 41, 66.5F, 166.7F),new Person("Anja","Blum",Gender.FEMALE,16, 60.0F, 150.0F),
                new Person("John", "Claiderman", Gender.OTHER, 53, 80.3F, 166.2F), new Person("Don", "Sleiman",Gender.OTHER , 22, 65.3F, 170.7F),
                new Person("Manny","Lowell", Gender.MALE, 92, 109.3F, 200.5F),new Person("Mick ","Patches",Gender.MALE, 63, 78.3F, 190.2F),
                new Person("Lala","Fell", Gender.FEMALE, 32, 68.3F, 175.2F)};

        double[] filteredPeople = Stream.of(people)
                .filter(person -> person.getGender() == Gender.FEMALE)
                .mapToDouble(Person::getHeight)
                .toArray();

//      Stream.of(people).filter(person -> person.getGender() ==Gender.FEMALE).forEach(System.out::println);

//        Stream.of(people).filter(person -> person.getAge()> 30).forEach(System.out::println);

        Stream.of(people)
                .filter(person -> person.getWeight()> 45)
                .filter(person -> person.getWeight()<70)
                .mapToDouble(Person::getHeight)
                .forEach(System.out::println);
//      Stream.of(people).filter(person -> person.getWeight()>50 && person.getWeight()<80).forEach(System.out::println);



        System.out.println(Arrays.toString(filteredPeople));


        Integer[] numbers = {3, 8, 2, 9, 78, 23, 30, 4};

        int sum = IntStream.rangeClosed(0, 10)
               .reduce(1, (acc, el) -> acc * el);


//        double result = IntStream.of(numbers)
//                .reduce("*",(acc,el) -> acc + el + "*");

//        OptionalInt min = IntStream.rangeClosed(0,10)
//                .min();
//        if(min.isPresent()){
//            System.out.println(min.getAsInt());
//        }else{
//            System.out.println("No result");
//        }

//        long result = longStream.of(numbers).count();
//        System.out.println(result);
//
//        String[] signs = {"&", "§", "$"};
//
//        Stream.of(signs).forEach(System.out::println);


//        IntStream iStream = IntStream.rangeClosed(0,100);
//        iStream.forEach((System.out::println));
//
//        Stream.of(people).forEach(System.out::println);
//
//        Stream.of(people).filter(s -> s.getAge() < 34)
//                .limit(35)
//                .forEach(System.out::println);
//
//        Stream.of(people)
//                .mapToInt(String::length)
//                .forEach(System.out::println);
//
//        String[] sa = Stream.of(peoples).toArray(String[]::new);


    }
}

