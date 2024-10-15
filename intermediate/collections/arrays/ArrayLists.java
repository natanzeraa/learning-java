package intermediate.collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * ArrayLists
 * Are dynamic arrays, runs slower than standard arrays but is helpful when lots of element manipulations are needed
 * Array lists are non-synchronized, which means they are not thread safe,
 * so it's advised not to use them in multi thread operations
 */

public class ArrayLists {
    public static void main(String[] args) {
        /* Declaration */
        ArrayList<Integer> arr = new ArrayList<>();

        /* Adding elements */
        int[] n = {22, 79, 35, 11, 2, 5, 99, 19, 46};

        for (var i = 0; i < n.length; i++) {
            arr.add(n[i]);
        }

        /* Printing out with all the elements */
        System.out.println("Array with all elements: " + arr);

        /* Getting element inside classic for loop */
        for (var i = 0; i < arr.size(); i++) {
            int element = arr.get(i); /* getting element by its index */

            int index = arr.indexOf(element); /* getting index from element */

            System.out.println(index + " : " + element); /* printing out index + element */
        }

        /* Removing element */
        arr.remove(2);

        /* Printing out */
        System.out.println("Removed element from index 2: " + arr);

        /* Setting new value for the element at index 5 */
        arr.set(5, 100);

        /* Printing out */
        System.out.println("Set new value for the element at index 5: " + arr);

        /* Printing array size */
        System.out.println("This array have a total of " + arr.size() + " elements.");

        /* Printing elements one by one */
        arr.forEach(System.out::println);

        /* Sorting elements */
        Collections.sort(arr);

        /* Printing sorted array */
        System.out.println("Sorted array: " + Arrays.toString(new ArrayList[]{arr}));

        /* Clearing all the array elements */
        arr.clear();

        /* Printing cleared array */
        System.out.println("Now the array is cleared out: " + arr);
    }

}
