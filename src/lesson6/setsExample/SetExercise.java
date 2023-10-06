package lesson6.setsExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * HashSet: uses a hash table to store elements, which provides constant-time performance for the basic operations,
 * such as add, remove, and contain.
 *
 * TreeSet: uses a tree structure to store elements, keeping the elements in sorted order.
 * This implementation provides efficient operations when adding, removing, and retrieving elements are done in sorted order.
 *
 * LinkedHashSet: is similar to HashSet, but maintains a linked list of the elements in the order in which they were inserted.
 * This allows for iteration over the elements in insertion order.
 *
 * Use Set to avoid duplicates in the list
 *
 * Sets are collections that avoid duplicate elements.
 */
public class SetExercise {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<String>();

        numbers.add("441-245-2213");
        numbers.add("441-245-2213");
        numbers.add("441-245-2213");

        numbers.add("623-123-5764");
        numbers.add("623-123-5764");
        numbers.add("623-123-5764");

        numbers.add("143-234-3123");
        numbers.add("143-234-3123");

        numbers.add("798-125-9568");
        numbers.add("798-125-9568");
        numbers.add("798-125-9568");

        Set<String> uniqueNumbers = new HashSet<String>(numbers);

        for(String number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}
