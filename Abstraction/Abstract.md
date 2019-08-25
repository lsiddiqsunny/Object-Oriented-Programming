# Abstraction

Abstraction is selecting data from a larger pool to show only the relevant details to the object.
It helps to reduce programming complexity and effort. In Java, abstraction is accomplished using Abstract classes and interfaces. It is one of the most important concepts of OOPs.

In java, abstraction is achieved by **interfaces** and **abstract classes**. We can achieve 100% abstraction using interfaces.

A class which is declared **“abstract”** is called as **an abstract class**. It can have abstract methods as well as **concrete methods**. A normal class **cannot** have abstract methods.

A method without a body is known as an **Abstract Method**. It must be declared in an abstract class. The abstract method will **never** be **final** because the abstract class must implement all the **abstract methods**.

## Rules of Abstract Method

1. Abstract methods do not have an implementation; it only has method signature
2. If a class is using an abstract method they must be declared abstract. The opposite cannot be true. This means that an abstract class **does not necessarily** have an abstract method.
3. If a regular class extends an abstract class, then that class **must implement** all the abstract methods of the abstract parent
4. It cannot be instantiated.
5. It can have constructors and static methods also.

Abstract methods are mostly declared where two or more subclasses are also doing the same thing in different ways through different implementations. It also extends the same Abstract class and offers different implementations of the abstract methods.

Abstract classes help to describe generic types of behaviors and object-oriented programming class hierarchy. It also describes subclasses to offer implementation details of the abstract class.

Example : [Abstract](../Java/src/Abstract.java)

## References

1. [Guru99](https://www.guru99.com/java-data-abstraction.html)
2. [Geeksforgeeks](https://www.geeksforgeeks.org/abstraction-in-java-2/)
3. [Java point](https://www.javatpoint.com/abstract-class-in-java)
