package intermediate.abstractclasses;

import java.util.ArrayList;

public class Division extends Math{
    private double result;

    public double mathOp(ArrayList<Double> values) {
        result = values.getFirst();
        for (var i = 1; i < values.size(); i++) result /= values.get(i);
        return result;
    }
}
