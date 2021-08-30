package be.intecbrussel.Chapter20.opdracht5;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

//        Queue<String> queue = new LinkedList<>();

        Queue<String> queue = new PriorityQueue<>();
        queue.offer("John");
        queue.offer("Richard");
        queue.offer("Sue");
        queue.offer("Ellen");
        //Handling queue
        String s = queue.peek();
        while (s != null){
            System.out.println("About to handle " + s);
            s = queue.poll();
            System.out.println("Handling " + s);
            s = queue.peek();
        }

    }
}
