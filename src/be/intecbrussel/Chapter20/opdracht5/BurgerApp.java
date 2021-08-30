package be.intecbrussel;
import be.intecbrussel.Chapter20.CollectionsDemo.AgeComparator;
import be.intecbrussel.Gender;
import be.intecbrussel.opdracht1.Person;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

//public class BurgerApp {
//    public static void main(String[] args) {

//        Queue<BurgerOrder> burgerOrders = new PriorityQueue<>(Comparator.comparing(BurgerOrder::getNumber));
//        burgerOrders.offer(new BurgerOrder("BigMac", 1));
//        burgerOrders.offer(new BurgerOrder("FishBurger", 2));
//        burgerOrders.offer(new BurgerOrder("Mc Veggie", 5));
//        burgerOrders.offer(new BurgerOrder("Cheeseburger", 8));
//        burgerOrders.offer(new BurgerOrder("Big Mac", 7));
//        burgerOrders.offer(new BurgerOrder("ChickenBurger", 4));
//        burgerOrders.offer(new BurgerOrder("FishBurger", 1));
//        burgerOrders.offer(new BurgerOrder("Big Mac", 5));

//        while (burgerOrders.size() > 0) {
//            System.out.println("Serving order:" + burgerOrders.poll());
//
//        }

//        Person[] people = {new Person("Jef", "Blum", Gender.MALE, 23, 78.3F, 176.2F), new Person("Laura", "Perez", Gender.FEMALE, 41, 66.5F, 166.7F), new Person("Anja", "Blum", Gender.FEMALE, 16, 60.0F, 150.0F),
//                new Person("John", "Claiderman", Gender.OTHER, 53, 80.3F, 166.2F), new Person("Don", "Sleiman", Gender.OTHER, 22, 65.3F, 170.7F),
//                new Person("Manny", "Lowell", Gender.MALE, 92, 109.3F, 200.5F), new Person("Mick ", "Patches", Gender.MALE, 63, 78.3F, 190.2F),
//                new Person("Lala", "Fell", Gender.FEMALE, 32, 68.3F, 175.2F)};

//
//        List<Person> menAboveForty = personList.stream()
//                .filter(person -> person.getGender()== Gender.MALE)
//                .filter(person -> person.getAge()>40)
//                .sorted(new AgeComparator())
//                .map(person -> person.setWeight(70.0F))
//                .collect(Collectors.toList());
//
//        List<Person> femaleAboveTwenty = personList.stream()
//                .filter(person -> person.getGender()== Gender.FEMALE)
//                .filter(person -> person.getAge()>20)
//                .sorted(new AgeComparator())
//                .collect(Collectors.toList());
//    }
//}
