package intermediate.collections.lists;


import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

/**
 * Vector
 * This is a class of the collection framework that implements a growable array of objects.
 * It's basically a dynamic array that can grow anc shrink as required.
 * They work pretty much the same as array lists on the surface, but the main difference is...
 * Vectors are synchronized, which means they are thread safe, so you can use it in multi-thread operations
 */

public class Vectors {
    public static void main(String[] args) {
        /* Declaration */
        Vector<Integer> vec = new Vector<>();

        /* Adding elements */
        int[] j = {22, 79, 77, 11, 2, 3, 99, 19, 0, 156};

        for (var i = 0; i < j.length; i++) {
            vec.add(j[i]);
        }

        /* Printing out with all the elements */
        System.out.println("Vector with all elements: " + vec);

        /* Getting element inside classic for loop */
        for (var i = 0; i < vec.size(); i++) {
            int element = vec.get(i); /* getting element by its index */
            int index = vec.indexOf(element); /* getting index from element */
            System.out.println(index + " : " + element); /* printing out index + element */
        }

        /* Removing element */
        vec.remove(2);

        /* Printing out */
        System.out.println("Removed element from index 2: " + vec);

        /* Setting new value for the element at index 5 */
        vec.set(5, 100);

        /* Printing out */
        System.out.println("Set new value for the element at index 5: " + vec);

        /* Printing vector size */
        System.out.println("This vector have a total of " + vec.size() + " elements.");

        /* Printing elements one by one */
        vec.forEach(System.out::println);

        /* Sorting elements */
        Collections.sort(vec);

        /* Printing sorted vector */
        System.out.println("Sorted vector: " + Arrays.toString(new Vector[]{vec}));

        /* Clearing all the vector elements */
        vec.clear();

        /* Printing cleared vector */
        System.out.println("Now the vector is cleared out: " + vec);
    }
}