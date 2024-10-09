package intermediate.abstractclasses;

import java.util.ArrayList;

public class Sum extends Math {
    private double result;

    public double mathOp(ArrayList<Double> values) {
        for (Double value : values) result += value;
        return result;
    }

}
