# Encapsulation

Encapsulation is one of the f fundamental OOP concepts.
Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data
(methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through **the methods of their current class**. Therefore, it is also known as **data hiding**.

To achieve encapsulation in Java −

1. Declare the variables of a class as** private**.
2. Provide public **setter** and **getter** methods to modify and view the variables values.

## Advantage of Encapsulation in Java

By providing only a setter or getter method, you can make the class **read-only or write-only**. In other words, you can skip the getter or setter methods.

It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the **logic inside** the setter method. You can write the logic not to store the negative numbers in the setter methods.

It is a way to achieve data hiding in Java because other class will not be able to access the data through the **private data members**.

The encapsulate class is easy to test. So, it is better for **unit testing**.

The standard IDE's are providing the facility to generate the getters and setters. So, it is **easy and fast** to create an encapsulated class in Java.

Example : [Encapsulation](../Java/src/Account.java)

## References

1. [Tutorials point](https://www.tutorialspoint.com/java/java_encapsulation.htm)
2. [Java point](https://www.javatpoint.com/encapsulation)
