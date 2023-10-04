package lesson6.queuesExample;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * HashSet: uses a hash table to store elements, which provides constant-time performance for the basic operations,
 * such as add, remove, and contain.
 *
 * TreeSet: uses a tree structure to store elements, keeping the elements in sorted order.
 * This implementation provides efficient operations when adding, removing, and retrieving elements are done in sorted order.
 *
 * LinkedHashSet: is similar to HashSet, but maintains a linked list of the elements in the order in which they were inserted.
 * This allows for iteration over the elements in insertion order.
 *
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
