package intermediate.collections.maps;

import java.util.HashMap;

/**
 * HashMaps stores items in Key, Value pairs, and you can access them by an index of another type
 * It doesn't keep insertion order, if you need this functionality, choose instead a LinkedHashMap
 */
public class HashMaps {
    public static void main(String[] args) {
        /* Creating HashMap */
        HashMap<Integer, String> h = new HashMap<>();

        /* Adding items into the HashMap */
        h.put(0, "BMW");
        h.put(115, "Mercedes");
        h.put(268, "Jaguar");
        h.put(339, "Porsche");

        System.out.println("\nItems in the HashMap: " + h);

        /* Getting an item */
        String item = h.get(115);

        System.out.println("\nThe item with the key 115 is: " + item);

        /* Removing an item */
        String removedItem = h.remove(268);

        System.out.println("\nThe removed item is: " + removedItem);

        /* Getting HashMap size using size() */
        System.out.println("\nThe size of the HashMap is: " + h.size());

        /* Clearing the HashMap */
        h.clear();

        System.out.println("\nAfter clearing, the HashMap became: " + h);

        /* Looping through the HashMap and adding elements */
        String[] soccerPlayers = {"L. Messi", "C. Ronaldo", "Neymar Jr.", "Pelé", "Maradona", "Baggio"};

        int id = 341230;

        for (String player : soccerPlayers) {
            h.put(id, player);
            id++;
        }

        System.out.println("\nNow the HashMap has players: " + h + "\n");


        /* Accessing keys and values */
        for (Integer i : h.keySet()) {
            System.out.println("The id: " + i + " belongs to " + h.get(i));
        }
    }
}
