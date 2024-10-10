package intermediate.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* The <?> represents the unknown type in Java.
 * It can be used in a lot of situations including local variable, field or type of parameter.
 * There is a few types and different usages for the wildcard.*/

/*This wildcard type is specified using the wildcard character (?), for example, List.
 *This is called a list of unknown types. These are useful in the following cases –
 *When writing a method that can be employed using functionality provided in Object class.
 *When the code is using methods in the generic class that doesn’t depend on the type parameter*/

public class Unbounded {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Word1", "Word2", "Word3"));
        List<Double> doubles = new ArrayList<>(Arrays.asList(1.1, 4.4, 7.7));
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));

        printList(strings);
        printList(doubles);
        printList(integers);

    }

    public static void printList(List<?> list) {
        System.out.println(list);
    }
}
