package intermediate.oop;

public class Polymorphism {
	public static void main(String[] args) {
		AdminUser admin = new AdminUser();
		admin.welcomeUser();
		admin.welcomeUser("mr. admin");

		RegularUser regular = new RegularUser();
		regular.welcomeUser();
		regular.welcomeUser("mr. regular");

	}
}
