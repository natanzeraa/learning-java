package intermediate.collections.arrays;


import java.util.ArrayList;
import java.util.Vector;

class ComparisonBetweenVectorAndArrayListRuntime {
    public static void main(String[] args) throws InterruptedException {

        /* Testing ArrayList in single thread */
        System.out.println("Testing ArrayList in single thread...");

        ArrayList<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        int items = 1000000;

        for (var i = 0; i < items; i++) arrayList.add(i);

        long end = System.currentTimeMillis();

        System.out.println("Added " + arrayList.size() + " items to arrayList in " + (end - start) + "ms");


        /* Testing Vector in single thread */
        System.out.println("\nTesting Vector in single thread...");

        Vector<Integer> vector = new Vector<>();

        start = System.currentTimeMillis();

        for (var i = 0; i < items; i++) vector.add(i);

        end = System.currentTimeMillis();

        System.out.println("Added " + vector.size() + " items to vector in " + (end - start) + "ms");

        System.out.println("\nAs you can see, at this point, ArrayList wins the single-thread faster runtime battle 👆");


        /* Testing ArrayList multi-thread operation */
        System.out.println("\nTesting multi-thread ArrayList...");

        ArrayList<Integer> multiThreadedArrayList = new ArrayList<>();

        start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (var i = 0; i < items; i++) multiThreadedArrayList.add(i);
        });
        Thread t2 = new Thread(() -> {
            for (var i = 0; i < items; i++) multiThreadedArrayList.add(i);
        });

        t1.start();

        t2.start();

        t1.join();

        t2.join();

        end = System.currentTimeMillis();

        System.out.println("Added " + multiThreadedArrayList.size() + " items to multiThreadedArrayList, in " + (end - start) + "ms");


        /* Testing Vector multi-thread operation */
        System.out.println("\nTesting multi-thread Vector...");

        Vector<Integer> multiThreadedVector = new Vector<>();

        start = System.currentTimeMillis();

        t1 = new Thread(() -> {
            for (var i = 0; i < items; i++) multiThreadedVector.add(i);
        });

        t2 = new Thread(() -> {
            for (var i = 0; i < items; i++) multiThreadedVector.add(i);
        });

        t1.start();

        t2.start();

        t1.join();

        t2.join();

        end = System.currentTimeMillis();

        System.out.println("Added " + multiThreadedVector.size() + " items to multiThreadedVector, in " + (end - start) + "ms");

        System.out.println("\nAs you can see, ArrayList runs faster even on multi-thread, but, it does not insert the correct amount of elements as it should.");

        System.out.println("\nAlso, sometimes ArrayList will return an ArrayIndexOutOfBoundsException, because it cannot deal with multi-thread operations correctly.");

        System.out.println("\nSo, Vector wins the multi-thread faster runtime battle 👆");

    }
}
