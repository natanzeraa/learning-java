package intermediate.abstractclasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<>(Arrays.asList(400.1, 24.2, 2.3));

        Sum sum = new Sum();
        double sumResult = sum.mathOp(values);
        System.out.println("The result of sum is " + sumResult);

        Subtraction sub = new Subtraction();
        double subResult = sub.mathOp(values);
        System.out.println("The sub result is " + subResult);

        Multiplication mult = new Multiplication();
        double multResult = mult.mathOp(values);
        System.out.println("The multiplication result is " + multResult);

        Division div = new Division();
        double divResult = div.mathOp(values);
        System.out.println("The division result is " + divResult);
    }
}
