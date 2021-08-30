package be.intecbrussel;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApp {
    public static void main(String[] args) {

        Integer[] numbers = {5, 3, -7, 300, 80};

        Stream.of(numbers)
                .map(Integer::doubleValue)
                .filter(number -> number>0)
                .sorted()
                .forEach(System.out::println);

        for(Integer i : numbers){

            i*=2;
            if(i<0) i=0;

        }
        //insert sort method here
        System.out.println(Arrays.toString(numbers));
    }
}
