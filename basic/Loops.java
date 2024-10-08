package basic;

public class Loops {
    public static void main(String[] args) {
        for(var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int y = 0;
        int x = 10;
        while(y < x) {
            System.out.println(y++);
        }

        int a = 0;
        int b = 10;
        do {
            System.out.println(a++);
        } while(a < b);
    }
}
