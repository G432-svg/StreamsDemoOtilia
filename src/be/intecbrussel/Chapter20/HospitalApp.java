package be.intecbrussel.Chapter20;
import java.util.*;

public class HospitalApp {
    public static void main(String[] args) {

        List<Person> people = new LinkedList<>();
        people.add(new Person("Evelyn", 80, Gender.FEMALE));
        people.add(new Person("Taylor", 17, Gender.OTHER));
        people.add(new Person("Keitaro", 27, Gender.MALE));
        people.add(new Person("Priya", 17, Gender.FEMALE));
        people.add(new Person("Mark", 22, Gender.MALE));
        people.add(new Person("Taran", 31, Gender.OTHER));
        people.add(new Person("Yousef", 68, Gender.MALE));
        people.add(new Person("Natasha", 26, Gender.FEMALE));
        people.add(new Person("Evelyn", 80, Gender.FEMALE));
        people.add(new Person("Mark", 55, Gender.MALE));
        people.add(new Person("Taran", 31, Gender.OTHER));

        NavigableSet<Person> personSet = new TreeSet<>(Comparator.comparing(Person::getName));
        personSet.addAll(people);

        for (int i = people.size()-1; i>=0 ; i--)
            System.out.println(people.get(i));
    }
//    List<String> sentence = new ArrayList<>();
//    Scanner scanner = new Scanner(System.in);
//    String word = "";
//
//        while(!word.endsWith(".")){
//        word = scanner.next();
//        sentence.add(word);
//    }
//        sentence.forEach(System.out::println);
}
