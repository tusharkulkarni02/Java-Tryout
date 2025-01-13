
 class A{

  public A(){
    System.out.println("object created");
  }

  public A(int n){
    super();
    System.out.println("Parameterized constructor of A");
  }
  
  public void show(){
    System.out.println("This is the show method");
  }
  
}






public class anonObject {
  public static void main(String[] args) {
     A obj; // this is creating a  reeference of an object. A memory is createed in stack

     obj = new A(); // this is declaring a object in Heap i.e a memory blocks allocated to teh object of A and then assigning it to the reference obj.
     // Now obj will hold the reference/memory location of the newly created object.

     // to create ANNONYMOUS OBJECTS
     new A(); // we can use them only once

     // we can access the class methods with annonymous objects.
      new A().show();

      // Note that both annonymous objeccts above are different, they have diff memorry locations in heap.
  }
}

/*
 * object created
object created
object created
This is the show method
 */
