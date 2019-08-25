
public class Modifiers
{
    int field;

    void foo() {

    }
}

class Modifiers_defult   // package private
{
    int field;    // package private field

    void foo() {  // package private method


    }
}


class Nested_class
{
    /*
    Non-static nested classes (inner classes) has access to all 
    members(static and non-static variables and methods, including private) 
    of its outer class and may refer to them directly in the same way that other 
    non-static members of the outer class do.
    */

    private class A{
        /*
        If the inner class is private it cannot be accessed by name outside of the 
        outer class. Inner and outer classes have access to each other's private methods 
        and private instance variables. As long as you are within the inner or outer class, 
        the modifiers public and private have the same effect.
        */
        /*
        Instance of inner private class can not be created outside of the outter class

        */


        
    }

    
    public class B{
        /*
        If the inner class is public it can be accessed by name outside of the 
        outer class. Inner and outer classes have access to each other's private methods 
        and private instance variables. As long as you are within the inner or outer class, 
        the modifiers public and private have the same effect.
        */

        /*
        Nested_class nested_class=new Nested_class();
        B b=nested_class.new B();

        */


        
    }

    protected class C{
        /*The protected access modifier will restrict access from classes other than the ones 
        in the same package and its subclasses.*/

    }

    static class D{
        /* Static class can be access without creating instance of the outter class unlike 
        other non-static class.*/

        /*

        Nested_class.D d=new Nested_class.D();
        */
    }

    



}


/*It is an inner class without a name and for which only a single object is created. An anonymous 
    inner class can be useful when making an instance of an object with certain “extras” such as 
    overloading methods of a class or interface, without having to actually subclass a class.

    // Test can be interface,abstract/concrete class
    Test t = new Test() 
    {
        // data members and methods
        public void test_method() 
        {

        }   
    };
    constructors can not be declared in an anonymous class.
    We cannot declare static initializers or member interfaces in an anonymous class.
    An anonymous class can have static members provided that they are constant variables.
    */