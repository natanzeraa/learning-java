package intermediate.Oop;

public class User {
	private String username;
	private String email;

	public void setUsername(String value) {
		username = value;
	}

	public void setEmail(String value) {
		email = value;
	}

	public void showUsername() {
		if (username == null) {
			System.out.println("Username is not defined!");
		} else {
			System.out.println("The username is " + username);
		}

	}

	public void showEmail() {
		if (email == null) {
			System.out.println("Email is not defined!");
		} else {
			System.out.println("The " + username + " email is " + email);
		}

	}

	/* Check out the AdminUser.java - RegularUser.java - Polymorphism.java 
	 * I'm using this method to apply the overriding technique*/
	public void welcomeUser() {
		System.out.println("Welcome!");
	}

}
