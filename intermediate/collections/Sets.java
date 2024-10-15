package intermediate.collections;

import java.util.*;

// A Set is a Java interface that is part of the Collections Framework
// It works very similar to an ArrayList, but it's used in a very different way to solve different problems
// A set doesn't accept duplicates, it stores elements in an unordered way, it doesn't have indexes, etc...
public class Sets {
    public static void main(String[] args) {
        // Declaration
        Set<String> s = new HashSet<>();

        // Adding elements to the hashset
        String[] names = {"Jhon", "Sharon", "Leslie", "Megh", "Smith", "Andrew"};

        List.of(names).forEach(s::add);

        System.out.println("Added the following values to the Set: " + s);

        // Removing element
        // As we don't have indexes, elements can only be removed by its values
        s.remove("Leslie");

        System.out.println("Set after removing Leslie: " + s);

        // Checking if a value exists inside our hashset
        System.out.println("is there an element called Megh? " + s.contains("Megh"));

        // Checking size
        System.out.println("The Set has the length of " + s.size() + " elements");

    }
}


// Imagine that you have a List with lots of duplicates
// You want to remove the duplicates, filter it
// Sure you can just create a crazy algorithm to do it, but it may take to much time
// A fast and efficient way to do it is the following:
class CopyListIntoSetToRemoveDuplicates {
    public static void main(String[] args) {
        // List with the duplicates
        List<String> duplicates = new ArrayList<>(Arrays.asList("Monkey", "Lion", "Cat", "Monkey", "Eagle", "Snake", "Snake"));

        System.out.println("Array of duplicates " + duplicates);

        // Simply add the "duplicates" list to the HashSet constructor, and it'll magically do the work
        Set<String> s = new HashSet<>(duplicates);

        System.out.println("HashSet of non-duplicated values " + s);
    }
}

// A TreeMap work a bit different when it comes to ordering the inserted values
// It naturally "sorts" the values in its natural ordering
// TreeMaps is a way slower than HasSets or LinkedHashSets because of its "under-the-hood" operations
// But if you need values ordinated by its natural ordering, just go ahead and choose TreeMap
class TreeMaps {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();

        String[] animals = {"Monkey", "Lion", "Cat", "Monkey", "Eagle", "Snake", "Snake"};

        List.of(animals).forEach(s::add);

        s.forEach(System.out::println);
    }
}

// LinkedHasSets work with pointers and nodes, just like the LinkedList
// If you want to keep the insertion order of the elements, that's the choice
// It runs quite fast as a HashSet and keeps the insertion order
class LinkedHashSets {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();

        String[] brands = {"Mizuno", "Nike", "Puma", "Adidas", "Hoka", "Olympikus", "Sketchers"};

        List.of(brands).forEach(s::add);

        System.out.println("The LinkedHashSet natural insertion order is: " + s);

    }
}