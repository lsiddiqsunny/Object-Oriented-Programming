
// Class Declaration 
  
public class Dog  implements Cloneable
{ 
    // Instance Variables 
    String name; 
    String breed; 
    int age; 
    String color; 
  
    // Constructor Declaration of Class 
    public Dog(String name, String breed, 
                   int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
  
    public Dog() {
    }

    // method 1
    public String getName() 
    { 
        return name; 
    } 
  
    // method 2 
    public String getBreed() 
    { 
        return breed; 
    } 
  
    // method 3 
    public int getAge() 
    { 
        return age; 
    } 
  
    // method 4 
    public String getColor() 
    { 
        return color; 
    } 
  
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ 
               ".\nMy breed,age and color are " + 
               this.getBreed()+"," + this.getAge()+ 
               ","+ this.getColor()); 
    } 
    public Object clone()throws CloneNotSupportedException{  
        return super.clone();  
    }  
  
    public static void main(String[] args) throws CloneNotSupportedException 
    { 

        /* Declaration of an object.
        If we declare reference variable(tuffy) like this, its value will be 
        undetermined(null) until an object is actually created and assigned to it. 
        Simply declaring a reference variable does not create an object.
        */

        Dog puppuy;

        /*Initializing an object
        There are 3 ways to initialize object in Java.

           1. By reference variable
           2. By method
           3. By constructor
        
        */

        Dog tuffy = new Dog("tuffy","papillon", 5, "white"); 
        System.out.println(tuffy.toString()); 


        /*Intializing an object by clone*/
        puppuy= (Dog)tuffy.clone();

        //anonymous object  
        /*Anonymous simply means nameless. An object which has no reference is known 
        as an anonymous object. It can be used at the time of object creation only.

        If you have to use an object only once, an anonymous object is a good approach.*/
        new Dog();
    } 
}