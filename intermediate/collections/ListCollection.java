package intermediate.collections;

import java.util.*;

public class ListCollection {
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

class ArrayLists {
    public static void main(String[] args) {
        // Declaration
        List<Integer> dbList = new ArrayList<>();

        // Adding elements
        int n = 7;
        for (var i = 0; i < n; i++) {
            dbList.add(i);
        }

        // Removing element
        dbList.remove(2);

        // Printing out
        System.out.println(dbList);

        //Printing elements one by one
        dbList.forEach(System.out::println);
    }
}


// Vector
// This is a class of the collection framework that implements a growable array of objects.
// It's basically a dynamic array that can grow anc shrink as required.

class Vectors {
    public static void main(String[] args) {
        // Declaration
        List<Integer> vector = new Vector<>();

        // Adding elements
        int n = 7;
        for (var i = 0; i < n; i++) {
            vector.add(i);
        }

        // Removing element
        vector.remove(4);

        // Printing out
        System.out.println(vector);

        //Printing elements one by one
        vector.forEach(System.out::println);
    }
}


// Stack is a class that extends Vector.
// It works with the LIFO principle (last in, first out)
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
//


class LinkedLists {
    public static void main(String[] args) {
        // Declaration
        List<Integer> linked = new LinkedList<>();

        // Adding elements
        int n = 7;
        for (var i = 0; i < n; i++) {
            linked.add(i);
        }

        // Printing out
        System.out.println(linked);

        // Printing elements one by one
        linked.forEach(System.out::println);
    }
}