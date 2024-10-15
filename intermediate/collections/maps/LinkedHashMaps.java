package intermediate.collections.maps;

import java.util.LinkedHashMap;

/**
 * LinkedHashMaps stores items in Key, Value pairs,
 * and you can access them by an index of another type
 * It also works with nodes and pointers
 * LinkedHashMaps keeps insertion order, but are slower than HaspMaps,
 * so if you don't need this functionality, you may choose HashMap
 */
public class LinkedHashMaps {
    public static void main(String[] args) {
        /* Creating LinkedHashMap */
        LinkedHashMap<Integer, String> l = new LinkedHashMap<>();

        /* Adding items into the LinkedHashMap */
        l.put(0, "Rice");
        l.put(115, "Beans");
        l.put(268, "Meat");
        l.put(339, "Tomato");
        l.put(3394, "Coconut");

        System.out.println("\nItems in the LinkedHashMap: " + l);

        /* Getting an item */
        String item = l.get(115);

        System.out.println("\nThe item with the key 115 is: " + item);

        /* Removing an item */
        String removedItem = l.remove(268);

        System.out.println("\nThe removed item is: " + removedItem);

        /* Getting LinkedHashMap size using size() */
        System.out.println("\nThe size of the LinkedHashMap is: " + l.size());

        /* Clearing the LinkedHashMap */
        l.clear();

        System.out.println("\nAfter clearing, the LinkedHashMap became: " + l);

        /* Looping through the LinkedHashMap and adding elements */
        String[] fOnePilots = {"Verstappen", "Norris", "Leclerc", "Piastri", "Sainz", "Hamilton"};

        int id = 98777;

        for (String player : fOnePilots) {
            l.put(id, player);
            id++;
        }

        System.out.println("\nNow the LinkedHashMap has F1 pilots: " + l + "\n");


        /* Accessing keys and values */
        for (Integer i : l.keySet()) {
            System.out.println("The id: " + i + " belongs to " + l.get(i));
        }
    }
}
