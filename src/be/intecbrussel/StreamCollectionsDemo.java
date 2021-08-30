package be.intecbrussel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamCollectionsDemo {
    public static void main(String[] args) {


        List<String> lyrics = new ArrayList<>();
        lyrics.add("Oops");
        lyrics.add("I");
        lyrics.add("did");
        lyrics.add("it");
        lyrics.add("again");
        lyrics.add("I");
        lyrics.add("played");
        lyrics.add("with");
        lyrics.add("your");
        lyrics.add("heart");

        List<String> wordsWithI = lyrics.stream()
                .filter(s -> s.toLowerCase(Locale.ROOT).contains("i"))
                .sorted()
                .map(s -> s.toLowerCase(Locale.ROOT))
                .collect(Collectors.toList());

        wordsWithI.forEach(System.out::println);
    }
}
