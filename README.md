[//]: # (![Java logo]&#40;https://img.shields.io/badge/java-%23FF0000.svg?style=for-the-badge&logo=javafx&logoColor=white&#41;)
[//]: # (![Java logo]&#40;https://dev.java/assets/images/java-logo-vector.png&#41;)

<img src="https://dev.java/assets/images/java-logo-vector.png" height="50px"  alt="Java Logo"/>

# Learning Java

*This repository is dedicated to the Java basics*

*We're covering:* 
- Variables
- Data types
- Primitive and Non-primitive types
- Control structures
- Loops
- Arrays
- Classes
- Objects
- Inheritance
- Polymorphism
- Access Modifiers

---

<a id="types"></a>
## Primitive Data Types

        Data Type       Size	    Description

        byte	    1 byte	    Stores whole numbers from -128 to 127
        short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
        int   	    4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	    1 bit	    Stores true or false values
        char	    2 bytes	    Stores a single character/letter or ASCII values

---

### Non-Primitive Data Types

Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:

Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type always has a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc.

---
## Variables

Variables are ways to store data in the program memory, so it can be manipulated in many ways.

But first you need to "start" a variable in order to store some value. In Java you can do this by following this structure:

**Type variableName = value;**

**Example:**

    String name = "Eliud Kipchoge";
    char gender = 'M';
    int age = 39;
    float height = 1.77f;
    double weight = 52.30d;
    boolean isAnAthlete = true;
    byte heartRate = 127;
    short maratonSteps = 32767;
    long centimetersRunned = 9223372036854775807L;

You can see the variables file here: [Variables.java](https://github.com/natanzeraa/learning-java/blob/main/Variables.java)

---

<a id="arrays"></a>
## Arrays

Arrays are one of the most important and used data structure, if you have any contact with programming languages, it's quit impossible to not use a list, array or whatever the language you're learning calls it.

Basically in Java, arrays are a way to store "a list of multiple elements" of the same type in a single variable.

For example: imagine that you have a lottery app, and wants to store lucky numbers in it. The structure to do it is the following:

**type[] arrayName = new type[intNumber];**

1. Declare the type of the array (String, int, float, char, long, short, byte, etc...) and add the "[]" to indicate it is an array
2. Give it a name, it can be whatever you want, since it follows the camel case rules ( likeThisOneRightHere )
3. You need initialize the array by typing ( new type[intNumber] ), this is necessary to initialize and indicate how many elements will be stored in the array.

**Example:**

    int[] intArr = new int[3];
 
You can add elements to the java array by doing this:

        intArr[0] = 5;
        intArr[1] = 16;
        intArr[2] = 87;

1. Define the position of the element to be inserted ( intArr[0] )
2. Give it a value respecting its type

**Obs:** *In the above example we're using integers, and this type in java just like many other numeric types has a max limit that cannot be exceeded, for example integers can represent numbers from -2147483648 to 2147483647. But this is a topic to [Primitive and Non-Primitive](#types) types.*

You can see the arrays file here: [Lists.java](https://github.com/natanzeraa/learning-java/blob/main/Lists.java)

---

### Array List

This is also an array but a little bit different way to work with.
Basically Array Lists are dynamic arrays, you don't need to predefine its length.

Every Array List is gonna store a certain type of elements, and it can be any type available in Java.

You can add and remove as many elements as you want, and everything is ok!

**Structure**

    ArrayList<type> variableName = new ArrayList<type>();

- Declare ArrayList type first
- Than write what type of elements its gonna store
- Declare the variable name
- And initialize the array

You can also initialize it with or without values in it.

**Structure:**

    ArrayList<type> variableName = new ArrayList<type>(Arrays.asList(values, separated, by, comma));

- Do the same as the first one
- Import Arrays from java.util.Arrays
- Call the asList() method
- Pass the values separating them by comma

**Example:**

    ArrayList<String> brands = new ArrayList<>(Arrays.asList("Apple", "Microsoft", "Nvidia"));

You can see the arrays file here: [Lists.java](https://github.com/natanzeraa/learning-java/blob/main/Lists.java)

---

## Loops

Loops are ways to iterate over a list of any type or even a certain amount of times given by an integer number.

But first you might understand how it works and how to write it correctly:

### For Loop

    for (statement 1; statement 2; statement 3) {
        // code here
    }

- statement 1 sets the variable before the code starts
- statement 2 defines a condition for the loop
- statement 3 increases the variable set in the statement 1 every time the loop runs

**Example:**
    
    int age = 26;
    for(var i = 0; i < age; i++){
        System.out.println(i);
    }

### While Loop

    while (statement) {
        // code here
    }

- statement defines a condition for the loop

**Example:**
    
    int y = 0;
    int x = 10;
    
    while(y < x) {
        System.out.println(y++);
    }

### Do While Loop

    do {
        // code here
    } while(statement);

- do block defines where the code block to be executed
- statement defines a condition for the loop

**Example:**

int a = 0;
int b = 10;

    do {
        System.out.println(a++);
    } while(a < b);


You can see the loops file here: [Loops.java](https://github.com/natanzeraa/learning-java/blob/main/Loops.java)

---



---

[//]: # ()
[//]: # (## Methods)

[//]: # ()
[//]: # (*Methods, are a block of code that only runs when it is called,*)

[//]: # (*they accept external data also known as parameters.*)

[//]: # (*Some languages can call methods as functions, because can execute certain actions.*)

[//]: # ()
[//]: # (**Example:**)

[//]: # ()
[//]: # (    public String showSomeText&#40;&#41; {)

[//]: # (        return "This is a text";)

[//]: # (    })

[//]: # ()
[//]: # (*The code above is a method that returns a text.* )

[//]: # (*As you can see it does not take any parameters*)

[//]: # ()
[//]: # (*Now lets see a method that actually takes parameters.*)

[//]: # ()
[//]: # (**Example:**)

[//]: # ()
[//]: # (    public int sumOfTwoValues&#40;int a, int b&#41; {)

[//]: # (        return a + b;)

[//]: # (    })

[//]: # ()
[//]: # (*As you can see, this method is receiving two parameters and executing a sum of the two values.*)

[//]: # ()
[//]: # (*But now you must be asking yourself: How do I make this work? How do I use it?*)

[//]: # ()
[//]: # (*To use this method correctly, take a look at this example:*)

[//]: # ()
[//]: # (    public class Methods {)

[//]: # (        public static String someMethod&#40;String argument&#41; {)

[//]: # (            return argument;)

[//]: # (        })

[//]: # (    )
[//]: # (        public static void main&#40;String[] args&#41; {)

[//]: # (            String argument = someMethod&#40;"This is an argument!"&#41;;)

[//]: # (            System.out.println&#40;argument&#41;;)

[//]: # (        })

[//]: # (    })

[//]: # ()
[//]: # (**Example II:**)

[//]: # (    )
[//]: # (    public class Methods {)

[//]: # (        public static void main&#40;String[] args&#41; {)

[//]: # (            Sum sum = new Sum&#40;&#41;;)

[//]: # (            sum.sumOfTwoValues&#40;10, 35&#41;;)

[//]: # (        })

[//]: # (    })

[//]: # ()
[//]: # (    class Sum {)

[//]: # (        public int sumOfTwoValues&#40;int a, int b&#41; {)

[//]: # (            return a + b;)

[//]: # (        })

[//]: # (    })

[//]: # ()
[//]: # (You can see the methods file here: [Methods.java]&#40;https://github.com/natanzeraa/learning-java/blob/main/Methods.java&#41;)

[//]: # ()
[//]: # (---)
