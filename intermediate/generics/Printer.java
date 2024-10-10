package intermediate.generics;

/* This is the basic generic class structure you can use*/
public class Printer<T> {
    T valueToPrint;

    public Printer(T value) {
        this.valueToPrint = value;
    }

    public void print() {
        System.out.println(valueToPrint);
    }
}
