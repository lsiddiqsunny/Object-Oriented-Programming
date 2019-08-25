# Class and Object

Classes and Objects are basic concepts of Object Oriented Programming which revolve around the real life entities.
We will discuss it in java context.

## Class

A  class is a user defined blueprint or prototype from which objects are created.  
It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order:

**Modifiers :** A class can be public or has default access. Nested interfaces and classes can have all access specifiers., i.e. 1) *private* 2) *default* (when no access specifier is specified) 3) *protected* 4) *public*

Access Levels

    Modifier    Class   Package Subclass  EveryWhere

    public        Y        Y       Y         Y

    protected     Y        Y       Y         N

    default       Y        Y       N         N
    
    private       Y        N       N         N

Example : [Modifiers](../Java\src\Modifiers.java)

**Class name:** The name should begin with a initial letter (capitalized by convention).

**Superclass(if any):** The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.

**Interfaces(if any):** A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.

**Body:** The class body surrounded by braces, { }.

Constructors are used for initializing new objects. Fields are variables that provides the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.

There are various types of classes that are used in real time applications such as [nested classes](../Java\src\Modifiers.java), [anonymous classes](../Java\src\Modifiers.java), **lambda expressions**(will be discussed in interface section).

## References

1. [Anonymous class](https://www.geeksforgeeks.org/anonymous-inner-class-java/)
2. [Nested class](https://www.geeksforgeeks.org/nested-classes-java/)
3. [Access modifiers](https://www.geeksforgeeks.org/access-specifiers-for-classes-or-interfaces-in-java/)
