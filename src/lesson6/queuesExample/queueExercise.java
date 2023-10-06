package lesson6.queuesExample;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * Queues are collections that support a First-In, First-Out order, so that we can process elements in the order they arrive.
 */
public class queueExercise {
    public static void main(String[] args) {
        Queue<String> queueCustomers = new LinkedList<String>();

        queueCustomers.add("1234");
        queueCustomers.add("3412");
        queueCustomers.add("0123");
        queueCustomers.add("4321");

        while (!queueCustomers.isEmpty()) {
            System.out.println("Customer " + queueCustomers.poll() + " is getting helped");
        }
    }
}
