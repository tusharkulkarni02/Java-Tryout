
class Calculator{
  public int add(int a, int b){
    return a + b;
  }
};

// Constructor is only used to assign value to the datatypes/properties. It does not return anything.

public class classes {
 public static void main(String[] args) {
   int n1 = 23;
   int n2 = 54;
    /*
      Important Points
      Declaration: 
      
      Calculator calc; 
      
      only declares a reference to an object but does not create the object in memory.
      
      Instantiation: calc = new Calculator(); actually creates an object of type Calculator and assigns it to the reference variable calc.
      You can then use calc to call methods and work with the Calculator object.
      
      Null Pointer Exception:
      If you try to use calc before initializing it, you will get a NullPointerException:

      calc.add(n1, n2); // Throws NullPointerException because calc is null   
    */  
   Calculator calc = new Calculator();
   int res = calc.add(n1,n2);

   System.out.println("res : " + res);

 } 
}
