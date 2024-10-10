package intermediate.generics;

public class Cat extends Animal {
    private String breed;

    public Cat(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "The cat breed is " + breed;
    }

    @Override
    public void animalSound(String breed) {
        System.out.println("Meow");
    }
}
