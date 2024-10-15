package intermediate.collections.sets;

import java.util.*;

/**
 * Imagine that you have a List with lots of duplicates
 * You want to remove the duplicates, filter it
 * Sure you can just create a crazy algorithm to do it, but it may take to much time
 * A fast and efficient way to do it is the following:
 */
public class CopyListIntoSetToRemoveDuplicates {
    public static void main(String[] args) {
        /* List with the duplicates */
        List<String> duplicates = new ArrayList<>(Arrays.asList("Monkey", "Lion", "Cat", "Monkey", "Eagle", "Snake", "Snake"));

        System.out.println("Array of duplicates " + duplicates);

        /* Simply add the "duplicates" list to the HashSet constructor, and it'll magically do the work */
        Set<String> s = new HashSet<>(duplicates);

        System.out.println("HashSet of non-duplicated values " + s);
    }
}


