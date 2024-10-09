package intermediate.oop;


class Person {
    /* Encapsulation basically is a way to protect your class data from being accessed directly.
     * If anyone wants to get some information, they should ask for it, not just simply take it from you.
     * So, that's the reason why you should make your class attributes private and then use public methods to
     * grant access to its values as needed. */

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int setAge(int value) {
        age = value;
        return age;
    }

    public String setName(String value) {
        name = value;
        return name;
    }

}


public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(37);
        person.setName("Bruce Benner");
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
