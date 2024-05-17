package JavaforQA.HW05Part2;


import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    // Create a priority queue to store passengers with custom comparator
    Queue<Passenger> queue = new PriorityQueue<>((p1, p2) -> {
        // If p1 is first class and p2 is not, p1 should come first (-1)
        // If p2 is first class and p1 is not, p2 should come first (1)
        // If both are first class or both are not, they are considered equal (0)
        return Boolean.compare(p2.isFirstClass(), p1.isFirstClass());
    });

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

