
class A{
  public void show(){
    System.out.println("IN CLASS A");
  }
}


abstract class X{
  abstract public void display();
}

public class usingAnonInnerClass {
  public static void main(String[] args) {


    A obj = new A()
    { // This is annonymou inner class. 
      // We cancreeate it at the time of definin an object.
      // thesse dont ha any name.
      // they can override andimplement new menthods and data.
      @Override
      public void show(){
        System.out.println("This is ANNONYMOUS Class");
      }
    };
    // Above, we have not created a object of A but
    // we have creeated object of annoymous class. 
    obj.show();



    // We can instantiate anonymouss clas of astract class
    // Mind herre we are not instantiating the abstract class
    // we are creatingg a new annonymous class , which can accesss the method of A
    X obj1 = new X(){
      @Override
      public void display(){
        System.out.println("Displaying annonymous class of abstract class X");
      }
    };
    obj1.display();
  }
}
