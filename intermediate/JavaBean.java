package intermediate;

import java.io.Serializable;

public class JavaBean implements Serializable {
    /*
    PEOPLE USE TO MAKE CONFUSION BETWEEN POJO AND JAVA BEANS

    What it needs to be a Java Bean?
    1. It must have a no-args constructor
    2. Properties must be private
    3. Public getters and setters
    4. Must be serializable

    YOU CAN CHECK THE JAVA BEAN EXAMPLE AT: intermediate.JavaBean.java

    */


    private int age;
    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
