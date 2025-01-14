
class A{
  public void show() {
      System.out.println("In A");
  }
}

class B extends A{
  public void show(){
    System.out.println("In B");
  }
}

class C extends A{
  public void show(){
    System.out.println("In c");
  }
}


public class usingPolymorphism{
  public static void main(String[] args) {
      A obj = new A(); // ref obj points to object of A
      obj.show();

      obj = new B(); // ref obj points to object of B
      obj.show(); // Assigning referrence of A type to object of B. We can do that when we are dealing with Inherited class.

      obj = new C(); // ref obj points to object of C
      obj.show();

      /*
        We can assign the object of a child to a reference of a parent.


       * Here, first will show --> In A 
       *       Second will show --> In B
       *       third will show  ---> In C
       * 
       * This is happening due to dynamic dispatch , which is achieved in Runtime Polymorphism.
       * This can only happen when classes are related through
       */
  }
}

/*
 * Polymrphism ------> Two types:
 *                     1) Runtime Polymorphism = Function overriding  ---> complier takes decision at runtime
 *                     2) Compiletime Polymorphism = Function overloading --> complier takes decision at start of program.
 */