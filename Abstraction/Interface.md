# Interface

An interface in java is a **blueprint** of a class. It has **static constants and abstract methods**.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the **IS-A relationship**.

It cannot be **instantiated** just like the abstract class.

Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have **private methods** in an interface.

## The relationship between classes and interfaces

As shown in the figure given below, a class extends another class, an interface extends another interface, but a class implements an interface.

![Interface relation](../Assests/Picture/interfacerelation.jpg)

Example : [Interface](../Java/src/Interface.java)

## Important point about Interface

1. We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.
2. A class can implement more than one interface.
3. An interface can extends another interface or interfaces (more than one interface) .
4. A class that implements interface must implements all the methods in interface.
5. All the methods are public and abstract. And all the fields are public, static, and final.
6. It is used to achieve multiple inheritance.
7. It is used to achieve loose coupling.

## References

1. [Java point](https://www.javatpoint.com/interface-in-java)
