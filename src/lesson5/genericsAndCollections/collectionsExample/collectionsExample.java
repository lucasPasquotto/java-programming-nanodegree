package lesson5.genericsAndCollections.collectionsExample;

import java.util.LinkedList;
import java.util.List;

public class collectionsExample {
    public static void main(String[] args) {
        List<String> listOfItems = new LinkedList<String>();

        listOfItems.add("Mike");
        listOfItems.add("Bob");
        listOfItems.add("Alice");

        for (String names: listOfItems) {
            System.out.println(names);
        }
    }
}