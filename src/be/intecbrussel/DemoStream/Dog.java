package be.intecbrussel.DemoStream;
import java.util.Arrays;

import java.util.stream.Stream;

public class Dog {

    private static boolean isVaccinated;
    public String Name;
    public int age;
//    boolean isVaccinated;
    private boolean vaccinated;

    public Dog(String name, int age, boolean isVaccinated) {
        Name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static boolean isVaccinated() {
        return isVaccinated;
    }

    public boolean setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
        return vaccinated;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", isVaccinated=" + isVaccinated +
                '}';
    }

    public static boolean isVaccinated(Boolean aBoolean) {
        return isVaccinated;
    }
}
