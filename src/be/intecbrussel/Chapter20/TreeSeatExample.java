package be.intecbrussel.Chapter20;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSeatExample {
    public static void main(String[] args) {

        NavigableSet <String> words = new TreeSet<>();
        words.add("Hello");
        words.add("hello");
        words.add("zebra");
        words.add("ne");
        words.add("hello");
        words.add("it's");
        words.add("apple");

        for(String word : words){
            System.out.println(word);
        }
        System.out.println(words.first());
        System.out.println(words.last());

    }
}
