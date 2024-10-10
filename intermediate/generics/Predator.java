package intermediate.generics;

/* This is simple example of how you can use generic classes and even extend other type classes
 * You can also implement an interface without removing the current extended class
 * But there's a few rules:
 * 1. You can only extend a single class and interface, and that's why Java doesn't support multiple inheritance
 * 2. Classes must come after interfaces, for example, this would not work at all -> public class Predator<T Serializable & Animal>
 * 3. In generic classes, interfaces are not implemented as we know, in this case we use (extends) to implement the interface*/

import java.util.ArrayList;
import java.util.List;

public class Predator<T extends Animal> {
    private List<T> predators;

    public Predator() {
        this.predators = new ArrayList<>();
    }

    public void addNewPredator(T predator) {
        predators.add(predator);
    }

    public void showPredators() {
        for (T predator : predators) {
            System.out.println(predator);
        }
    }

}
