package intermediate;

public class Pojo {

	/*
	 * PLAIN OLD JAVA OBJECT
	 * 
	 * 1. Can't extend any classes 2. Can't implement any interfaces 3. Can't use
	 * outside annotations
	 * 
	 */
}

/*
 * Example 1 It doesn't extend anything or implement any interface or even use
 * an outside annotation
 */

class Cat {
	int age;
	String name;
}

/*
 * PEOPLE USE TO MAKE CONFUSION BETWEEN POJO AND JAVA BEANS
 * 
 * What it needs to be a Java Bean? 1. It must have a no-args constructor 2.
 * Properties must be private 3. Public getters and setters 4. Must be
 * serializable
 * 
 * YOU CAN CHECK THE JAVA BEAN EXAMPLE AT: intermidiate.JavaBean.java
 * 
 */
