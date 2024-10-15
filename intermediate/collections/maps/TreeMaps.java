package intermediate.collections.maps;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * A TreeMap work a bit different when it comes to ordering the inserted values
 * It naturally "sorts" the values in its natural ordering
 * TreeMaps is a way slower than HasSets or LinkedHashSets because of its "under-the-hood" operations
 * But if you need values ordinated by its natural ordering, just go ahead and choose TreeMap
 */
public class TreeMaps {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();

        String[] animals = {"Monkey", "Lion", "Cat", "Monkey", "Eagle", "Snake", "Snake"};

        List.of(animals).forEach(s::add);

        s.forEach(System.out::println);
    }
}


