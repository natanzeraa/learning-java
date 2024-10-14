package intermediate.others;

public class ClassesAndObjects {
	/*
	 * 3 ways to initialize an object
	 * 
	 * 1. by referencing a variable 2. by method 3. by constructor
	 */
}

// 1 Reference variable

class Car {
	String brand;
	String model;
	int year;
	boolean isNew;
}

class CarDemo {
	public static void main(String[] args) {
		Car myCar = new Car(); // no-args constructor
		myCar.brand = "Ford";
		myCar.model = "Bronco";
		myCar.year = 2021;
		myCar.isNew = true;
	}
}

// 2 By method

class Dog {
	String breed;
	double weight;

	void insertDog(String b, double w) {
		breed = b;
		weight = w;
	}

	void showDog() {
		System.out.println(breed + " " + weight);
	}
}

class DogDemo {
	public static void main(String[] args) {
		Dog myDog = new Dog(); // no-args constructor

		myDog.insertDog("Golden Retriever", 45.50);
		myDog.showDog();
	}
}

// 3 By Constructor

class Drink {
	String beverageName;
	boolean alcoholicBeverage;

	Drink(String b, boolean a) {
		beverageName = b;
		alcoholicBeverage = a;
	}

	void showDrink() {
		System.out.println(beverageName + " " + alcoholicBeverage);
	}
}

class DrinkDemo {
	public static void main(String[] args) {
		Drink myDrink = new Drink("Beer", true); // all-args constructor
		myDrink.showDrink();
	}
}