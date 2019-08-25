
interface Printable{  
    void print(); 
    //Since Java 8, we can have method body in interface. But we need to make it default method. 
    default void msg(){
        System.out.println("default method");
    } 
    //Since Java 8, we can have static method in interface.
    static int cube(int x){return x*x*x;}  

    /*
    From Java 9 onwards, interfaces can contain following also

    Static methods
    Private methods
    Private Static methods
    */
 
}  
interface Showable{  
    void show();  
}  

// A class can implements more than one interface
class A implements Printable,Showable{  
public void print(){
    System.out.println("Hello");
}  
    
public void show(){
    System.out.println("Welcome");
}  
}

public  class Interface{
    public static void main(String args[]){  
        A obj = new A();  
        obj.print();  
        obj.show();  
        obj.msg();
    }  
}
