package intermediate.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* The <?> represents the unknown type in Java.
 * It can be used in a lot of situations including local variable, field or type of parameter.
 * There is a few types and different usages for the wildcard.*/


/* It is expressed using the wildcard character (‘?’), followed by the super keyword,
 * followed by its lower bound: <? super A>. */


/* In this case, arguments can be Integer or superclass of Integer, which is Number.
 * The method showOnlyIntegerClassOrSuperClass() will only take Integer or its superclass objects.*/

/* Use super wildcard when you put values in a structure.
 * Don’t use wildcard when you get and put values in a structure.
 * You can specify an upper bound for a wildcard, or you can specify a lower bound, but you cannot specify both.*/

public class LowerBounded {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        showOnlyIntegerClassOrSuperClass(list);


        /* If you try something like this...

         * List<String> strings = new ArrayList<>(Arrays.asList("Word1", "Word2"));
         * showOnlyIntegerClassOrSuperClass(strings);

         * Its not going to work at all.*/
    }

    public static void showOnlyIntegerClassOrSuperClass(List<? super Integer> list) {
        System.out.println(list);
    }
}
