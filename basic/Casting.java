package basic;

public class Casting {
	public static void main(String[] args) {
		// Casting is how you transform a variable of type A into B
		// A bigger bit value cannot be implicit casted into a smaller bit one
		// Example: you cannot cast a integer value into a double without explicit saying it
		
		// Widening casting (implicit)
		int height = 185;
		double heightInMeters = height;
		System.out.println(heightInMeters);
		
		// Narrowing casting (explicit)
		double weight = 97.90;
		int integerWeight = (int) weight;
		System.out.println(integerWeight);
		
		// Rule of three example 
		int questions = 90;
		int answers = 77;
		
		float result = (float) (answers * 100.0) / questions;
		System.out.println("The student answered " + result + "% corectly.");
	}
}
