package intermediate.collections.sets;

import java.util.*;

/**
 * A Set is a Java interface that is part of the Collections Framework
 * It works very similar to an ArrayList, but it's used in a very different way to solve different problems
 * A set doesn't accept duplicates, it stores elements in an unordered way, it doesn't have indexes, etc...
 */
public class Sets {
    public static void main(String[] args) {
        /* Declaration */
        Set<String> s = new HashSet<>();

        /* Adding elements to the hashset */
        String[] names = {"Jhon", "Sharon", "Leslie", "Megh", "Smith", "Andrew"};

        List.of(names).forEach(s::add);

        System.out.println("Added the following values to the Set: " + s);

        /* Removing element */
        /* As we don't have indexes, elements can only be removed by its values */
        s.remove("Leslie");

        System.out.println("Set after removing Leslie: " + s);

        /* Checking if a value exists inside our hashset */
        System.out.println("is there an element called Megh? " + s.contains("Megh"));

        /* Checking size */
        System.out.println("The Set has the length of " + s.size() + " elements");

    }
}
