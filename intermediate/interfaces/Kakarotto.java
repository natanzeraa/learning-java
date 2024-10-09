package intermediate.interfaces;

public class Kakarotto extends Saiyajin implements SuperSayiajinPowers {
    private static final String name = "Goku";

    public String getName() {
        return name;
    }

    public void genkiDama() {
        System.out.println("Genki Dama");
    }

    public void kamehameha() {
        System.out.println("Kamehameha!");
    }

    public static void main(String[] args) {
        Saiyajin sayiajin = new Saiyajin();

        sayiajin.setHasTail(true);
        sayiajin.setPowerLevel(8598);

        String hasTail = (sayiajin.getTail()) ? "i have a tail" : " i don't have a tail";
        System.out.println("Hi, my name is " + name + ", i'm a Super Sayiajin, " + hasTail + " and my power level is more than " + sayiajin.getPowerLevel());

    }

}
