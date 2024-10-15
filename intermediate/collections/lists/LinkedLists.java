package intermediate.collections.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


/**
 * LinkedLists
 * They work with nodes and pointers
 * A linked list has a Head and a Tail, and everything in the middle can be accessed by an ordinated way
 * Imagine that you want to get the 4th element of your linked list, under the hood what it does is
 * Start from the element 0, and go one item after another until it finds the corresponding index
 * For this kind of operation like, getting an element, it runs slower an array list for example
 * But linked lists really rock when you need to make changes in your list
 * Imagine that you have a list with a million elements, and you want to add a new element to the 450.135th position
 * A linked list will search for the index and add the element
 * Otherwise an array list will make a copy from the current array all the way empty, then it'll start to add the previous values,
 * Leave the 450.135th position blank and only after that, add the desired value, which makes the operation a way more complex and slow
 */
public class LinkedLists {
    public static void main(String[] args) {
        /* Declaration */
        LinkedList<Integer> lkd = new LinkedList<>();

        /* Adding elements */
        int[] n = {22, 79, 66, 35, 11, 2, 5, 99, 19, 46};

        for (var i = 0; i < n.length; i++) lkd.add(n[i]);

        /* Printing out with all the elements */
        System.out.println("Linked List with all elements: " + lkd);

        /* Getting element inside classic for loop */
        for (var i = 0; i < lkd.size(); i++) {
            int element = lkd.get(i); /* getting element by its index */

            int index = lkd.indexOf(element); /* getting index from element */

            System.out.println(index + " : " + element); /* printing out index + element */
        }

        /* Removing element */
        lkd.remove(2);

        /* Printing out */
        System.out.println("Removed element from index 2: " + lkd);

        /* Setting new value for the element at index 5 */
        lkd.set(5, 100);

        /* Printing out */
        System.out.println("Set new value for the element at index 5: " + lkd);

        /* Printing array size */
        System.out.println("This linked list have a total of " + lkd.size() + " elements.");

        /* Printing elements one by one */
        lkd.forEach(System.out::println);

        /* Sorting elements */
        Collections.sort(lkd);

        /* Printing sorted array */
        System.out.println("Sorted linked list: " + Arrays.toString(new LinkedList[]{lkd}));

        /* Clearing all the array elements */
        lkd.clear();

        /* Printing cleared array */
        System.out.println("Now the linked list is cleared out: " + lkd);
    }
}
