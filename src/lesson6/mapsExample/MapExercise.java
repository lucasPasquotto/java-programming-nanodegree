package lesson6.mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Notes: In computer science, the efficiency of an algorithm is often expressed using Big O notation.
 * Maps allow us to find an element in O(1) time complexity,
 * which is more efficient than the O(n) time complexity required for a linear search, such as in Arrays.
 *
 * Use Maps to retrieve an element from a list in constant time
 *
 * Maps are collections that use key-value pairs, making it possible for us to find an element more efficiently (in constant time rather than linear time).
 */
public class MapExercise {

    public static void main(String[] args) {
        Map<String, Person> mapOpPeople = new HashMap<String, Person>();

        Person mike = new Person("Mike", "mike@email.com");
        Person shaun = new Person("Shaun", "shaun@email.com");
        Person sally = new Person("Sally", "sally@email.com");
        Person cesar = new Person("Cesar", "cesar@email.com");

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(mike);
        people.add(shaun);
        people.add(sally);
        people.add(cesar);

        for (Person person : people) {
            MapExercise.addToMap(mapOpPeople, person);
        }

        for (String email : mapOpPeople.keySet()) {
            System.out.println(email);
        }

        for (Person person : mapOpPeople.values()) {
            System.out.println(person);
        }

        System.out.println("Get Mike: " + mapOpPeople.get("mike@email.com"));
        System.out.println("Get Jeff: " + mapOpPeople.get("jeff@email.com"));
        System.out.println("Contains Mike: " + mapOpPeople.containsKey("mike@email.com"));
        System.out.println("Contains Jeff: " + mapOpPeople.containsKey("jeff@email.com"));

    }

    private static void addToMap(Map<String, Person> map, Person person) {
        map.put(person.getEmail(), person);
    }
}
