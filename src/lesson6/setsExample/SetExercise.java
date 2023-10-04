package lesson6.setsExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Use Set to avoid duplicates in the list
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
