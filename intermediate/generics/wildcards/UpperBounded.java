package intermediate.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* The <?> represents the unknown type in Java.
 * It can be used in a lot of situations including local variable, field or type of parameter.
 * There is a few types and different usages for the wildcard.*/

/* Upper Bounded wildcards can be used when you want to relax the restrictions on a variable.
 * For example, say you want to write a method that works on List < Integer >, List < Double >, and List < Number >,
 * you can do this using an upper bounded wildcard.
 * To declare an upper-bounded wildcard, use the wildcard character (‘?’),
 * followed by the extends keyword, followed by its upper bound.*/

/* Use extend wildcard when you want to get values out of a structure.
 * Don’t use wildcard when you get and put values in a structure.
 * You can specify an upper bound for a wildcard, or you can specify a lower bound, but you cannot specify both.*/


public class UpperBounded {
    public static void main(String[] args) {
        List<Integer> intListToSum = new ArrayList<>(Arrays.asList(34, 56, 12, 89)); // Initialize an array of integers
        List<Double> doubleListToSum = new ArrayList<>(Arrays.asList(34.56, 56.44, 12.78, 8.39)); // Initialize an array of doubles

        System.out.println("Total int sum is: " + sum(intListToSum));
        System.out.println("Total double sum is: " + sum(doubleListToSum));
    }

    /* Let's say you want to write a method that works with Integer, Double and Number
     * It doesn't matter what type is being passed,as long as it extends the clas Number.*/

    public static double sum(List<? extends Number> list) {
        double result = 0.0;
        for (Number i : list) result += i.doubleValue();
        return result;
    }

}
