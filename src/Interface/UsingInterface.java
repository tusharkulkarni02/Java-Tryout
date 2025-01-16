// Interface is like a guide
// We can implement the class using the interface.
// Interface dont have their memory in heap.
// We cannot make a object of interface, just like abstract class.


/* In InterfaceS
 *  - All the methods are abstract public.
 *  - To implement interface , we have to create a subclass,
 *    with the help of "Implements" keyword
 *  - All the variables in a Interface are final and static.
 *  - That means since final , we have to initialize variable.
 */


/*
 * WHAT TO USE WHEN WHO INHERITS WHOM?
 * 
 * class extends class
 * class implements interface
 * interface extends interfacee
 * 
 */

// Defining Interface
interface A{ 
  int age = 44;
  String area = "Mumbai";

  void show();
  void config();

}

interface  X{
  void run();
}

interface Y extends X{

}

// If we want to use any Interface in a subclass then use keyword Implements.
// All the methods should be declared in the subclass, otherwise it will become abstract


// CLASS CAN IMPLEMENT MULTIPLE INTERFACES 
// BUT CLASS CAN INHERIT MULTIPLE CLASSES.
class B implements A,Y{
  public void show(){
    System.out.println("In show");
  }

  public void config(){
    System.out.println("In config");
  }

  public void run(){
    System.out.println("In run");
  }
} 


public class UsingInterface {
  public static void main(String[] args) {
    
    // We can access the variable inside a intrface using its name. 
    System.out.println(A.age);
    System.out.println(A.area);


    A obj; // reference of A
    obj = new B(); // assigning obj of B
    obj.show();
    obj.config();
    

    // creating ref of interface x and assigning obj of B to it. 
    // This makes the methods in X accessible to B. But now, we cant access the methods of A.
    // As obj is of type X.
    X obj1 = new B();
    obj1.run();

    

  }  
}
