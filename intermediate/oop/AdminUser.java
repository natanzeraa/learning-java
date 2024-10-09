package intermediate.oop;

public class AdminUser extends User {
	protected String defaultUsername = "admin";
	protected String defaultEmail = "admin@email.com";
	protected final boolean hasHighAccessPrivileges = true;
	protected final boolean canManageRegularUserData = true;

	public void showDefaultUsername() {
		System.out.println("The default admin username is " + defaultUsername);
	}

	public void showDefaultEmail() {
		System.out.println("The default admin email is " + defaultEmail);
	}

	/*
	 * Overriding the User class method to understand how polymorphism works I'm
	 * using this method to apply the overriding technique You comment and uncomment
	 * this method and test it at Polymorphism.java to see how it works
	 */
	public void welcomeUser() {
		System.out.println("This is how admin users say welcome!");
	}

	/*
	 * Check out the Polymorphism.java file. I'm using this method to apply the
	 * overloading technique
	 */
	public void welcomeUser(String value) {
		System.out.println("Welcome " + value + "!");
	}
}
