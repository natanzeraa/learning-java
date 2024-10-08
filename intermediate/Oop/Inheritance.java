package intermediate.Oop;

public class Inheritance {
	public static void main(String[] args) {
		AdminUser admin = new AdminUser();
		admin.setEmail("albert@einstein.com");
		admin.setUsername("einstein");
		admin.showEmail();
		admin.showUsername();

		admin.showDefaultEmail();
		admin.showDefaultUsername();

		System.out.println("Has admin user high access privileges? " + admin.hasHighAccessPrivileges);

		RegularUser regular = new RegularUser();
		regular.setEmail("mickeymouse@mickeymouse.com");
		regular.setUsername("mickeymouse");
		regular.showEmail();
		regular.showUsername();

		regular.showDefaultEmail();
		regular.showDefaultUsername();

		System.out.println("Has regular user high access privileges? " + regular.hasHighAccessPrivileges);

	}
}
