package be.intecbrussel.Chapter20;

import java.util.Comparator;

public class PersonNameComparable implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
//        return (o1.getName()- o2.getName());
        return 0;
    }
}
