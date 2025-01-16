/*
 * To create a Thread, you have to ways
 *  1. By extending the Thread class
 *      - With the thread class, we can create a child class , define run method in it.
 *        Call the obj of that class, and do obj.start() 
 *  2. Implementing Runnable interface
 *      - With the Runnable Interface, we have to implement the Runnable interface in child subclass
 *        a. Create a Runnable reference of the child object.
 *        b. Pass that in the constructor of the Thread t1 = new Thread(object_of_child)
 *        c. Use the Thread methods .start() with t1 by t1.start().
 * 
 *  
 */

class A implements Runnable{
  public void run(){
    for(int i=0;i<=5;i++){
      System.out.println("Hi");
      try {
          Thread.sleep(10);
      } catch (InterruptedException e) {}
    }
  }
}

class B implements Runnable{
  public void run(){
    for(int i=0;i<=5;i++){
      try {
        Thread.sleep(15);
      } catch (InterruptedException e) { e.printStackTrace();}
      System.out.println("Hellow");
    }
  }
}


public class Demo{
 public static void main(String[] args) {    
    // We can assign the objectss of A and B to the referrence of type runnable because they are implementiing runnable.
    Runnable obj1 = new A();
    Runnable obj2 = new B();

    // Since the constructor of thread takes an obj as runnable
    // Now we can run the objects on the thread using the thread constructor.
    Thread T1 = new Thread(obj1);
    Thread T2 = new Thread(obj2);

    T1.start(); // Now we can use .start() as it is a method of Thread class.
    T2.start();

    // short form 

    // Runnable obj3 = ()->{
    //   for(int i=0;i<=5;i++){
    //     try {
    //       Thread.sleep(15);
    //     } catch (InterruptedException e) { e.printStackTrace();}
    //     System.out.println("Hellow");
    //   }
    // };
    // THIS WAS POSSIBLE BECAUSE RUNNABLE IS A FUNCTIONAL INTERFACE
  } 
}
