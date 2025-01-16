// Inner class is a class inside a class
// Class without STATIC inner class
class A{
  public void show(){
    System.out.println("In class A");
  }
  
  class B{
    public void config(){
      System.out.println("This is inner class B");
    }
  }
}

//  class with STATIC inner object
// Static can be used only inner class
class X{
  public void showX(){
    System.out.println("This is X");
  }
  static class Y{
    public void showY(){
      System.out.println("Thsi is Y");
    }
  }
}


public class UsingInnerClass {
  
  public static void main(String[] args) {
    
    
    // This method helps us to access a inner class , when inner class is not static.
    // create an object of A
    // with that object create an object of B 
    A obj = new A(); 
    obj.show();

    // A.B means B belongs to A
    A.B obj1 = obj.new B(); // creating obj of B with object of A, and assigning it to obj1 whose type is A.B
    obj1.config();


    //  if we make the inner object static then we can directly create the object like obj.B().
    X objX = new X();
    objX.showX();

    X.Y objY = new X.Y(); // Refering like new X.Y(), will only work when class is static.
    objY.showY(); 

  }
}
