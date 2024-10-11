# Collections in Java

*Tables were taken from the blog Geeks for Geeks so all the credits: https://www.geeksforgeeks.org/collections-in-java-2/*

Before we get started let's understand a few things:
- Collection API, is a concept
- Collection is an interface
- Collections is a class

###
### Methods of the Collection Interface

This interface contains various methods which can be directly used by all the collections which implement this interface. They are:


| Method                        | Description                                                                                               |
|-------------------------------|-----------------------------------------------------------------------------------------------------------|
| `add(Object)`                  | This method is used to add an object to the collection.                                                    |
| `addAll(Collection c)`         | This method adds all the elements in the given collection to this collection.                              |
| `clear()`                      | This method removes all of the elements from this collection.                                              |
| `contains(Object o)`           | This method returns true if the collection contains the specified element.                                 |
| `containsAll(Collection c)`    | This method returns true if the collection contains all of the elements in the given collection.            |
| `equals(Object o)`             | This method compares the specified object with this collection for equality.                               |
| `hashCode()`                   | This method is used to return the hash code value for this collection.                                     |
| `isEmpty()`                    | This method returns true if this collection contains no elements.                                          |
| `iterator()`                   | This method returns an iterator over the elements in this collection.                                      |
| `max()`                        | This method is used to return the maximum value present in the collection.                                 |
| `parallelStream()`             | This method returns a parallel Stream with this collection as its source.                                  |
| `remove(Object o)`             | This method is used to remove the given object from the collection. If there are duplicates, it removes the first occurrence. |
| `removeAll(Collection c)`       | This method is used to remove all the objects mentioned in the given collection from the collection.       |
| `removeIf(Predicate filter)`   | This method is used to remove all the elements of this collection that satisfy the given predicate.        |
| `retainAll(Collection c)`      | This method is used to retain only the elements in this collection that are contained in the specified collection. |
| `size()`                       | This method is used to return the number of elements in the collection.                                    |
| `spliterator()`                | This method is used to create a Spliterator over the elements in this collection.                          |
| `stream()`                     | This method is used to return a sequential Stream with this collection as its source.                      |
| `toArray()`                    | This method is used to return an array containing all of the elements in this collection.                  |

###
### Java List vs Set
Both the List interface and the Set interface inherits the Collection interface. However, there exists some differences between them.

| List                                                           | Set                                             |
|----------------------------------------------------------------|-------------------------------------------------|
| The List is an ordered sequence.                               | 	The Set is an unordered sequence.              |              
| List allows duplicate elements                                 | 	Set doesn’t allow duplicate elements.          | 
| Elements by their position can be accessed.                    | 	Position access to elements is not allowed.    |
| Multiple null elements can be stored.                          | 	The null element can store only once.          |
| List implementations are ArrayList, LinkedList, Vector, Stack	 | Set implementations are HashSet, LinkedHashSet. |  

###
## Lists

Why should i use Collections to work with lists?

Imagine that you have a single value and wants to store it somewhere. What can you do?
That's right!!!! Store it in a variable!
    
    int num = 10;

But, what if you have more than one element, imagine you have 20 elements and wants to store it. What would you do? 
Store it variable by variable a single value? Can you imagine 20 variables storing 20 elements one by one?
The scalability and maintainability concepts just went out the window, right?

So, in these cases we use an amazing thing called Arrays. These are lists that stores multiple values in a single variable.
The most basic way to do it in java is:
    
    int[] numArr = new int[20];

And now instead of declaring 20 variables for the same type of value, we are only declaring it once, 
and storing it all at one time.

But, you must be asking yourself... what Collections has to do with it?

If you try to work with arrays in its most basic way, it can become harder depending on the work you got to do.

For example, you need to remove an item from the array, how you do it? 
You can't!!! Because Java's native array implementation are size fixed and has no native methods to deal with deletion
or adding more elements that was previously defined.

You would have to create your own way to deal with it. And that is good exercise for beginners i know, 
but that's not the point here, the point is, if you are working at a big system on a big company, 
you must optimize your productivity.

There is when Collections come in and the fun begins.

You can now check out the **[ListCollection.java](https://github.com/natanzeraa/learning-java/blob/main/intermediate/collections/ListCollection.java)** file

###

### Methods of the List Interface
Since the main concept behind the different types of lists is the same, the list interface contains the following methods:

| Method                                | Description                                                                                                                                   |
|---------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|
| `add(int index, element)`             | Adds an element at a particular index in the list. When a single parameter is passed, it adds the element at the end of the list.              |
| `addAll(int index, Collection collection)` | Adds all the elements in the given collection to the list. When a single parameter is passed, it adds all elements at the end of the list.      |
| `size()`                              | Returns the size of the list.                                                                                                                 |
| `clear()`                             | Removes all elements from the list, but the reference to the list remains.                                                                    |
| `remove(int index)`                   | Removes the element at the specified index, shifting subsequent elements to the left and decreasing their indexes by 1.                        |
| `remove(element)`                     | Removes the first occurrence of the given element from the list.                                                                              |
| `get(int index)`                      | Returns the element at the specified index.                                                                                                   |
| `set(int index, element)`             | Replaces the element at a given index with a new element and returns the replaced element.                                                    |
| `indexOf(element)`                    | Returns the first occurrence of the given element, or -1 if the element is not present in the list.                                           |
| `lastIndexOf(element)`                | Returns the last occurrence of the given element, or -1 if the element is not present in the list.                                            |
| `equals(element)`                     | Compares the equality of the given element with the elements of the list.                                                                     |
| `hashCode()`                          | Returns the hashcode value of the list.                                                                                                       |
| `isEmpty()`                           | Checks if the list is empty. Returns `true` if the list is empty, otherwise `false`.                                                          |
| `contains(element)`                   | Checks if the list contains the given element. Returns `true` if the element is present, otherwise `false`.                                   |
| `containsAll(Collection collection)`  | Checks if the list contains all the elements in the given collection.                                                                         |
| `sort(Comparator comp)`               | Sorts the elements of the list based on the given comparator.                                                                                 |


