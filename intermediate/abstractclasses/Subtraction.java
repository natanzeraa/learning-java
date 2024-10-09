package intermediate.abstractclasses;

import java.util.ArrayList;

public class Subtraction extends Math {
    private double result;

    public double mathOp(ArrayList<Double> values) {
        result = values.getFirst();
        for (double i = 1; i < values.size(); i++) result -= values.get((int) i);
        return result;
    }

}
