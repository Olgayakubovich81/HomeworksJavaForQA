package JavaforQA.HW05Part2;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
        public static void main(String[] args) {
            // Create a queue to store passengers
            Queue<Passenger> queue = new LinkedList<>();

            // Create 3 passengers of the first class and 7 passengers of the second class
            for (int i = 0; i < 3; i++) {
                queue.add(new Passenger("First Class Passenger " + (i + 1), true));
            }
            for (int i = 0; i < 7; i++) {
                queue.add(new Passenger("Second Class Passenger " + (i + 1), false));
            }

            // Process the queue until it becomes empty
            while (!queue.isEmpty()) {
                Passenger passenger = queue.poll(); // Remove and return the first passenger in the queue
                System.out.println("Boarding: " + passenger.getName() + " (First Class: " + passenger.isFirstClass() + ")");
            }
        }
    }
