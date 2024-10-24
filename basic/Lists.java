package basic;

import java.util.Arrays;
import java.util.ArrayList;

public class Lists {
	public static void main(String[] args) {
		// Java's native arrays must have a predefined length

		// Starting with default values
		// This way, the array length is implicitly defined
		String[] strArrWithValues = { "Value 01", "Value 02" };
		System.out.println(strArrWithValues.length);

		int[] indexes = new int[2];
		int i = 0;
		int j = i + 1;

		while(i < strArrWithValues.length) {
			System.out.println("Ops " + j);
			i ++;
		}

		// Starting with no values
		String[] strArr = new String[2];
		strArr[0] = "Word 01";
		strArr[1] = "Word 02";

		int[] intArr = new int[3];
		intArr[0] = 47;
		intArr[1] = 42;
		intArr[2] = 77;
		System.out.println(intArr.length);

		float[] fltArr = new float[4];
		fltArr[0] = 1.84f;
		fltArr[1] = 1.65f;
		fltArr[2] = 1.55f;
		fltArr[3] = 1.98f;
		System.out.println(intArr.length);

		double[] dblArr = new double[5];
		dblArr[0] = 55.26;
		dblArr[1] = 46.25;
		dblArr[2] = 89.25;
		dblArr[3] = 22.25;
		dblArr[4] = 79.22;
		System.out.println(intArr.length);


	}
}

class ArrayLists {
	public static void main(String[] args) {
		// Starting with no values
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> ages = new ArrayList<>();
		ArrayList<Float> weights = new ArrayList<>();
		ArrayList<Double> heights = new ArrayList<>();

		// Starting with values
		ArrayList<String> brands = new ArrayList<>(Arrays.asList("Apple", "Microsoft", "Nvidia"));

		names.add("Jon");
		ages.add(34);
		weights.add(87.99f);
		heights.add(1.85);

		names.isEmpty();
		ages.remove(0);
		weights.size();
		heights.contains(1.85);
		brands.set(1, "Amazon");
	}
}
