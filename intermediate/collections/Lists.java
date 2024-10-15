package intermediate.collections;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

        // Create list of anything
        // Lists can be initialized with values
        List<String> strList = new ArrayList<>(Arrays.asList("Google", "Microsoft", "Apple", "Nvidia", "Amazon"));

        // Get an element from the list
        String element = strList.get(0);
        System.out.println("The requested element is " + element);

        // Add more items to the list
        strList.add("Meta");

        // Change an element value
        strList.set(1, "Samsung");

        //Remove an element by index
        strList.remove(3);

        // Remove an element by value
        strList.remove("Google");

        // Find the first index of an element in a list
        int firstIndex = strList.indexOf("Meta");
        System.out.println("The requested index is " + firstIndex);

        // Find the last index of an element in a list
        int lastIndex = strList.lastIndexOf("Apple");
        System.out.println("The last index of the element is " + lastIndex);

        // Check if an element is present in the list
        boolean isPresent = strList.contains("Amazon");
        String s = isPresent ? "Yes" : "No";
        System.out.println("Is the element present in the list? " + s);

        // Printing out list
        strList.forEach(System.out::println);

    }
}


// ArrayList
// Are dynamic arrays, runs slower than standard arrays but is helpful when lots of element manipulations are needed
// Array lists are non-synchronized, which means they are not thread safe,
// so it's advised not to use them in multi thread operations
class ArrayLists {
    public static void main(String[] args) {
        // Declaration
        ArrayList<Integer> arr = new ArrayList<>();

        // Adding elements
        int[] n = {22, 79, 35, 11, 2, 5, 99, 19, 46};
        for (var i = 0; i < n.length; i++) {
            arr.add(n[i]);
        }

        // Printing out with all the elements
        System.out.println("Array with all elements: " + arr);

        // Getting element inside classic for loop
        for (var i = 0; i < arr.size(); i++) {
            int element = arr.get(i); // getting element by its index
            int index = arr.indexOf(element); // getting index from element
            System.out.println(index + " : " + element); // printing out index + element
        }

        // Removing element
        arr.remove(2);

        // Printing out
        System.out.println("Removed element from index 2: " + arr);

        // Setting new value for the element at index 5
        arr.set(5, 100);

        // Printing out
        System.out.println("Set new value for the element at index 5: " + arr);

        // Printing array size
        System.out.println("This array have a total of " + arr.size() + " elements.");

        // Printing elements one by one
        arr.forEach(System.out::println);

        // Sorting elements
        Collections.sort(arr);

        // Printing sorted array
        System.out.println("Sorted array: " + Arrays.toString(new ArrayList[]{arr}));

        // Clearing all the array elements
        arr.clear();

        // Printing cleared array
        System.out.println("Now the array is cleared out: " + arr);
    }
}


// Vector
// This is a class of the collection framework that implements a growable array of objects.
// It's basically a dynamic array that can grow anc shrink as required.
// They work pretty much the same as array lists on the surface, but the main difference is...
// Vectors are synchronized, which means they are thread safe, so you can use it in multi-thread operations
class Vectors {
    public static void main(String[] args) {
        // Declaration
        Vector<Integer> vec = new Vector<>();

        // Adding elements
        int[] j = {22, 79, 77, 11, 2, 3, 99, 19, 0, 156};
        for (var i = 0; i < j.length; i++) {
            vec.add(j[i]);
        }

        // Printing out with all the elements
        System.out.println("Vector with all elements: " + vec);

        // Getting element inside classic for loop
        for (var i = 0; i < vec.size(); i++) {
            int element = vec.get(i); // getting element by its index
            int index = vec.indexOf(element); // getting index from element
            System.out.println(index + " : " + element); // printing out index + element
        }

        // Removing element
        vec.remove(2);

        // Printing out
        System.out.println("Removed element from index 2: " + vec);

        // Setting new value for the element at index 5
        vec.set(5, 100);

        // Printing out
        System.out.println("Set new value for the element at index 5: " + vec);

        // Printing vector size
        System.out.println("This vector have a total of " + vec.size() + " elements.");

        // Printing elements one by one
        vec.forEach(System.out::println);

        // Sorting elements
        Collections.sort(vec);

        // Printing sorted vector
        System.out.println("Sorted vector: " + Arrays.toString(new Vector[]{vec}));

        // Clearing all the vector elements
        vec.clear();

        // Printing cleared vector
        System.out.println("Now the vector is cleared out: " + vec);
    }
}

class ComparisonBetweenVectorAndArrayListRuntime {
    public static void main(String[] args) throws InterruptedException {

        // Testing ArrayList in single thread
        System.out.println("Testing ArrayList in single thread...");
        ArrayList<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        int items = 1000000;

        for (var i = 0; i < items; i++) arrayList.add(i);

        long end = System.currentTimeMillis();

        System.out.println("Added " + arrayList.size() + " items to arrayList in " + (end - start) + "ms");


        // Testing Vector in single thread
        System.out.println("\nTesting Vector in single thread...");

        Vector<Integer> vector = new Vector<>();

        start = System.currentTimeMillis();

        for (var i = 0; i < items; i++) vector.add(i);

        end = System.currentTimeMillis();

        System.out.println("Added " + vector.size() + " items to vector in " + (end - start) + "ms");

        System.out.println("\nAs you can see, at this point, ArrayList wins the single-thread faster runtime battle 👆");


        // Testing ArrayList multi-thread operation
        System.out.println("\nTesting multi-thread ArrayList...");

        ArrayList<Integer> multiThreadedArrayList = new ArrayList<>();
        start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (var i = 0; i < items; i++) multiThreadedArrayList.add(i);
        });
        Thread t2 = new Thread(() -> {
            for (var i = 0; i < items; i++) multiThreadedArrayList.add(i);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();

        System.out.println("Added " + multiThreadedArrayList.size() + " items to multiThreadedArrayList, in " + (end - start) + "ms");


        // Testing Vector multi-thread operation
        System.out.println("\nTesting multi-thread Vector...");

        Vector<Integer> multiThreadedVector = new Vector<>();
        start = System.currentTimeMillis();

        t1 = new Thread(() -> {
            for (var i = 0; i < items; i++) multiThreadedVector.add(i);
        });
        t2 = new Thread(() -> {
            for (var i = 0; i < items; i++) multiThreadedVector.add(i);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();

        System.out.println("Added " + multiThreadedVector.size() + " items to multiThreadedVector, in " + (end - start) + "ms");

        System.out.println("\nAs you can see, ArrayList runs faster even on multi-thread, but, it does not insert the correct amount of elements as it should.");
        System.out.println("\nAlso, sometimes ArrayList will return an ArrayIndexOutOfBoundsException, because it cannot deal with multi-thread operations correctly.");
        System.out.println("\nSo, Vector wins the multi-thread faster runtime battle 👆");

    }
}


// Stack is a class that extends Vector.
// It works with the LIFO principle (Last-In, First-Out)
// The Stack methods are: pop, push, empty, peek and search
class Stacks {
    public static void main(String[] args) {
        // Declaration
        Stack<Integer> stack = new Stack<>();

        // Verify if it's empty
        System.out.println("Is the stack empty? " + stack.isEmpty()); // It's true at this moment

        // Adding elements
        int n = 7;
        for (var i = 0; i < n; i++) stack.push(i);

        // Removing elements
        stack.pop();

        // Removing elements using for loop
        int j = 3;
        for (var i = 0; i < j; i++) stack.pop();

        // In order to use some value from the stack, it's recommended to assign the value to a variable
        int value = stack.pop();
        System.out.println("The assigned value is " + value);

        // If you want to see the top element of the stack, don't use pop(), because it removes the element,
        // instead you can use peek()
        int topElement = stack.peek();
        System.out.println("The top element is " + topElement);

        // To find an element in stack you can use search() method
        // If you try to search for a non-existent element it'll always return -1
        // and the top element you'll be return as 1, not 0 like in regular arrays.
        int foundElement = stack.search(0);
        System.out.println("Look what we found " + foundElement);

        // Printing out
        System.out.println("That's the stack now: " + stack);

        // Printing elements one by one
        stack.forEach(System.out::println);

        // Verify if it's empty again
        System.out.println("Is the stack empty again? " + stack.isEmpty()); // It's false at this moment

        // If you try to pop an element at the of the stack and there's no elements left
        // you'll get (Exception in thread "main" java.util.EmptyStackException),
        // because the pop() method returns an object, and if there's no object because you removed it,
        // it'll throw an error.
        // Example:

        int x = 4;
        for (var i = 0; i < x; i++) stack.pop();

    }
}


// Linked List
// They work with nodes and pointers
// A linked list has a Head and a Tail, and everything in the middle can be accessed by an ordinated way
// Imagine that you want to get the 4th element of your linked list, under the hood what it does is
// Start from the element 0, and go one item after another until it finds the corresponding index
// For this kind of operation like, getting an element, it runs slower an array list for example
// But linked lists really rock when you need to make changes in your list
// Imagine that you have a list with a million elements, and you want to add a new element to the 450.135th position
// A linked list will search for the index and add the element
// Otherwise an array list will make a copy from the current array all the way empty, then it'll start to add the previous values,
// Leave the 450.135th position blank and only after that, add the desired value, which makes the operation a way more complex and slow
class LinkedLists {
    public static void main(String[] args) {
        // Declaration
        LinkedList<Integer> lkd = new LinkedList<>();

        // Adding elements
        int[] n = {22, 79, 66, 35, 11, 2, 5, 99, 19, 46};
        for (var i = 0; i < n.length; i++) lkd.add(n[i]);

        // Printing out with all the elements
        System.out.println("Linked List with all elements: " + lkd);

        // Getting element inside classic for loop
        for (var i = 0; i < lkd.size(); i++) {
            int element = lkd.get(i); // getting element by its index
            int index = lkd.indexOf(element); // getting index from element
            System.out.println(index + " : " + element); // printing out index + element
        }

        // Removing element
        lkd.remove(2);

        // Printing out
        System.out.println("Removed element from index 2: " + lkd);

        // Setting new value for the element at index 5
        lkd.set(5, 100);

        // Printing out
        System.out.println("Set new value for the element at index 5: " + lkd);

        // Printing array size
        System.out.println("This linked list have a total of " + lkd.size() + " elements.");

        // Printing elements one by one
        lkd.forEach(System.out::println);

        // Sorting elements
        Collections.sort(lkd);

        // Printing sorted array
        System.out.println("Sorted linked list: " + Arrays.toString(new LinkedList[]{lkd}));

        // Clearing all the array elements
        lkd.clear();

        // Printing cleared array
        System.out.println("Now the linked list is cleared out: " + lkd);
    }
}
