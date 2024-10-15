package intermediate.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

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


// EnumSet is one of the specialized implementations of the Set interface for use with the enumeration type.
// You can check out more information about it at: https://www.geeksforgeeks.org/enumset-class-java/
class EnumSets {

    enum SoccerTeams {
        REAL_MADRID,
        BARCELONA,
        BAYERN_MUNCHEN,
        BORUSSIA_DORTMUND,
        JUVENTUS,
        MILAN,
        PARIS_SAINT_GERMAN,
        MONACO
    }

    enum Games {
        FC_25,
        READ_DEAD_REDEMPTION,
        GHOST_RECON_WILDLANDS,
        BATTLEFIELD_IV,
        NO_MANS_SKY,
        STARFIELD,
        DIABLO_IV,
    }

    public static void main(String[] args) {
        // Creating an EnumSet with the Games enum values
        EnumSet<Games> e = EnumSet.allOf(Games.class);

        System.out.println("\nInitial state of EnumSet created using allOf() method: " + e);

        // Creating an Iterator on games
        Iterator<Games> i = e.iterator();

        System.out.println("\nIterating over Games enum using iterator + while loop: ");

        while (i.hasNext()) {
            System.out.println(i.next() + ", ");
        }

        // Iterating with for loop
        System.out.println("\nIterating over Games enum using for loop: ");

        for (Games g : e) {
            System.out.println(g + ", ");
        }

        // Creating an EnumSet without the Games enum values
        EnumSet<Games> g = EnumSet.noneOf(Games.class);

        System.out.println("\nInitial state of EnumSet created using noneOf() method: " + g);

        // Adding game from e EnumSet to g
        g.add(Games.BATTLEFIELD_IV);

        System.out.println("\nAdd game from 'e' to 'g' EnumSet: " + g);

        // Adding all games from e EnumSet to g
        g.addAll(e);

        System.out.println("\nAdd all games from 'e' to 'g' EnumSet: " + g);


        // Creating multiple sets
        EnumSet<SoccerTeams> e1, e2, e3, e4, e5, e6, e7;

        e1 = EnumSet.of(SoccerTeams.REAL_MADRID, SoccerTeams.BARCELONA);

        e2 = EnumSet.of(SoccerTeams.BAYERN_MUNCHEN, SoccerTeams.BORUSSIA_DORTMUND);

        e3 = EnumSet.of(SoccerTeams.JUVENTUS, SoccerTeams.MILAN);

        e4 = EnumSet.of(SoccerTeams.PARIS_SAINT_GERMAN, SoccerTeams.MONACO);

        e5 = EnumSet.complementOf(e1);

        e6 = EnumSet.allOf(SoccerTeams.class);

        e7 = EnumSet.range(SoccerTeams.BAYERN_MUNCHEN, SoccerTeams.MILAN);

        System.out.println("\ne1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("e3: " + e3);
        System.out.println("e4: " + e4);
        System.out.println("e5: " + e5);
        System.out.println("e6: " + e6);
        System.out.println("e7: " + e7);

    }
}