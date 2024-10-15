package intermediate.collections.stacks;


import java.util.Stack;

/**
 * Stack is a class that extends Vector.
 * It works with the LIFO principle (Last-In, First-Out)
 * The Stack methods are: pop, push, empty, peek and search
 */

public class Stacks {
    public static void main(String[] args) {
        /* Declaration */
        Stack<Integer> stack = new Stack<>();

        /*
         * Verify if it 's empty
         * It 's true at this moment
         */
        System.out.println("Is the stack empty? " + stack.isEmpty());

        /* Adding elements */
        int n = 7;

        for (var i = 0; i < n; i++) stack.push(i);

        /*
         * Removing elements
         * */
        stack.pop();

        /* Removing elements using for loop */
        int j = 3;

        for (var i = 0; i < j; i++) stack.pop();

        /*
         * In order to use some value from the stack,
         * it 's recommended to assign the value to a variable
         */
        int value = stack.pop();

        System.out.println("The assigned value is " + value);

        /*
         * If you want to see the top element of the stack, don 't use pop(), because
         * it removes the element, instead you can use peek()
         */
        int topElement = stack.peek();

        System.out.println("The top element is " + topElement);

        /*
         * To find an element in stack you can use search() method
         * If you try to search for a non-existent element it'll always return -1
         * and the top element you'll be return as 1, not 0 like in regular arrays.
         */
        int foundElement = stack.search(0);

        System.out.println("Look what we found " + foundElement);

        System.out.println("That's the stack now: " + stack);

        /* Printing elements one by one */
        stack.forEach(System.out::println);

        /*
         * Verify if it 's empty again
         * It 's false at this moment
         */
        System.out.println("Is the stack empty again? " + stack.isEmpty());


        /*
         * If you try to pop an element at the of the stack and there's no elements left
         * you'll get (Exception in thread "main" java.util.EmptyStackException),
         * because the pop() method returns an object, and if there's no object because you removed it,
         * it'll throw an error.
         * Example:
         * */

        int x = 4;

        for (var i = 0; i < x; i++) stack.pop();

    }
}
