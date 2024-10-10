package intermediate.generics;

import java.util.ArrayList;
import java.util.List;

public class PetList<T> {
    private List<T> pets;

    public PetList() {
        this.pets = new ArrayList<>();
    }

    public void addPetToList(T pet) {
        pets.add(pet);
    }

    public void showPetList() {
        for (T pet : pets) {
            System.out.println(pet);
        }
    }

}
