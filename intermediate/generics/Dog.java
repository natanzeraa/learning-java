package intermediate.generics;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "The dog breed is " + breed;
    }

    @Override
    public void animalSound(String breed) {
        System.out.println("Woof woof");
    }
}
