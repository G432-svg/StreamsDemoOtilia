package be.intecbrussel.opdracht1;

import be.intecbrussel.Gender;

import java.io.IOException;
import java.io.InputStream;

public class Person extends InputStream {
        private  String firstName;
        private  String lastName;
        private Gender gender;
        private int age;
        private float weight;
        private float height;

    public Person(String firstName, String lastName,Gender gender, int age, float weight, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person() {

    }

    @Override
    public int read() throws IOException {
        return 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        if (Float.compare(person.getWeight(), getWeight()) != 0) return false;
        if (Float.compare(person.getHeight(), getHeight()) != 0) return false;
        if (getFirstName() != null ? !getFirstName().equals(person.getFirstName()) : person.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(person.getLastName()) : person.getLastName() != null)
            return false;
        if (getGender() != person.getGender()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + getAge();
        result = 31 * result + (getWeight() != +0.0f ? Float.floatToIntBits(getWeight()) : 0);
        result = 31 * result + (getHeight() != +0.0f ? Float.floatToIntBits(getHeight()) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}


