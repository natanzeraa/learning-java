package intermediate.generics;

public class Lynx extends Animal {
    private String breed;

    public Lynx(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "The breed of the Lynx is " + breed;
    }

    @Override
    public void animalSound(String breed) {
        System.out.println("Arrrrrrg");
    }
}
