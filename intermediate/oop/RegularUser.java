package intermediate.oop;

public class RegularUser extends User {
	protected String defaultUsername = "jhon";
	protected String defaultEmail = "jhon@email.com";
	protected final boolean hasHighAccessPrivileges = false;
	protected final boolean canManageItsOwnData = true;

	public void showDefaultUsername() {
		System.out.println("The default regular username is " + defaultUsername);
	}

	public void showDefaultEmail() {
		System.out.println("The default regular email is " + defaultEmail);
	}

	/*
	 * Overriding the User class method to understand how polymorphism works I'm
	 * using this method to apply the overriding technique You comment and uncomment
	 * this method and test it at Polymorphism.java to see how it works
	 */
	public void welcomeUser() {
		System.out.println("This is how regular users say welcome!");
	}

	/*
	 * Check out the Polymorphism.java file. I'm using this method to apply the
	 * overloading technique
	 */
	public void welcomeUser(String value) {
		System.out.println("Welcome " + value + "!");
	}
}
