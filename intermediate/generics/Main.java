package intermediate.generics;

public class Main {
    public static void main(String[] args) {
        /* When using generics in Java, you can't work with primitive types, so you must use the wrapper classes
         *
         * The next two examples above are the most basic use of generic types.
         * Where we have the T generic type, simply replace it with the needed type.*/
        Printer<String> printer = new Printer<>("Wow, its printing!");
        printer.print();

        Printer<Integer> printerTwo = new Printer<>(67);
        printerTwo.print();

        /*In this example we can create any object of any type and add it to the array.
         * It's a good way to improve scalability and this technique is quite used by Java developers.*/
        PetList<Object> pets = new PetList<>();
        pets.addPetToList(new Dog("American Bully"));
        pets.addPetToList(new Cat("America Bobtail"));
        pets.showPetList();

        /*In this example we can create any object and add items to do the array, since its types
         * extends the Animal class, because Predator generic class, extends it. */
        Predator<Lynx> lynxList = new Predator<>();
        lynxList.addNewPredator(new Lynx("Eurasian lynx"));
        lynxList.showPredators();

    }
}
