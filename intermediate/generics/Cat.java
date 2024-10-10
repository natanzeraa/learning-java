package intermediate.generics;

public class Cat extends Animal {
    private String breed;

    public Cat(String value) {
        this.breed = value;
    }

    public String getBreed() {
        return breed;
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
