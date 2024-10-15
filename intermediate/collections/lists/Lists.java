package intermediate.collections.lists;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

        /*
         * Create list of anything
         * Lists can be initialized with values
         */
        List<String> strList = new ArrayList<>(Arrays.asList("Google", "Microsoft", "Apple", "Nvidia", "Amazon"));

        /* Get an element from the list */
        String element = strList.get(0);

        System.out.println("The requested element is " + element);

        /* Add more items to the list */
        strList.add("Meta");

        /* Change an element value */
        strList.set(1, "Samsung");

        /* Remove an element by index */
        strList.remove(3);

        /* Remove an element by value */
        strList.remove("Google");

        /* Find the first index of an element in a list */
        int firstIndex = strList.indexOf("Meta");

        System.out.println("The requested index is " + firstIndex);

        /* Find the last index of an element in a list */
        int lastIndex = strList.lastIndexOf("Apple");

        System.out.println("The last index of the element is " + lastIndex);

        /* Check if an element is present in the list */
        boolean isPresent = strList.contains("Amazon");

        String s = isPresent ? "Yes" : "No";

        System.out.println("Is the element present in the list? " + s);

        /* Printing out list */
        strList.forEach(System.out::println);

    }
}
