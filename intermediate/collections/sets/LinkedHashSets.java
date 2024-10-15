package intermediate.collections.sets;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * LinkedHasSets work with pointers and nodes, just like the LinkedList
 * If you want to keep the insertion order of the elements, that's the choice
 * It runs quite fast as a HashSet and keeps the insertion order
 */
public class LinkedHashSets {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();

        String[] brands = {"Mizuno", "Nike", "Puma", "Adidas", "Hoka", "Olympikus", "Sketchers"};

        List.of(brands).forEach(s::add);

        System.out.println("The LinkedHashSet natural insertion order is: " + s);

    }
}
