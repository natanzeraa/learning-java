package basic;

public class Methods {
	/*
	 * 1. methodOne() is the name of the method. 2. Static means that the method
	 * belongs to the Main class and not an object of the Main class. 3. void means
	 * that this method does not have a return value.
	 */

	static void methodOne() {
		System.out.println("This is a method");
	}

	/*
	 * 1. Information can be passed to methods as a parameter. 2. Parameters act as
	 * variables inside the method. 3. You can add as many parameters as you want.
	 */

	static void methodWithParameters(String fName, String lName) {
		System.out.println("The full name is " + fName + " " + lName);
	}

	public static void main(String[] args) {
		methodOne();

		/*
		 * 1. When a parameter is passed to the method, it is called an argument. 2. So,
		 * from the example bellow: fName and lName are parameters while Jackie Chan,
		 * Tom Cruise and Chuck Norris are arguments.
		 */

		methodWithParameters("Jackie", "Chan");
		methodWithParameters("Tom", "Cruise");
		methodWithParameters("Chuck", "Norris");
	}
}
