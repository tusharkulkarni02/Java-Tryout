class A{
  public void show1(){
    System.out.println("This is a");
  }
}

class B extends A{
  public void show2(){
    System.out.println("This is b");
  }
}


public class UsingUp_DownCasting {
  
  public static void main(String[] args) {
    A obj = new B(); // Creeating a obbject of B and assigning it to reference of A
    // This is Actually upcasting . 
    // We are actually doing A obj = (A) new B();
  
    // Now we use method of A.
    obj.show1();

    // But now we cant access the methods of B. i.e obj.show2() ---> not accessible

    // downcast  the object

    B obj1 = (B) obj;
    obj1.show2();
  }

}
