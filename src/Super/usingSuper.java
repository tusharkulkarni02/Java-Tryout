// Every class in java has a method super() by default:
// It accesses the default constructor of the parent constructor
// If we pass a value in super(n) then it will be eligible to call the paremeterized constructor of A.
// But A should have a parameterized constructor

// If the inheretance is A->B->C->D, then if we call obj of C , then the execution of super() is as follows:
// First constructor of A invoked
// then B
// and then C  ;;;;;;;;;;; inshort calling upar se shuru hota

// If we instantiate the obj of A , then only constructor of A will be called.


/*
 * NOTE: Your will ask if we are in child class , super() access the class above it.
 *        What about super() of Parent?
 *        Ans :  Object class -> this is the universal class for everything in JAVA.
 */



class A{

  public A(){
    super();
    System.out.println("Default constructor of A");
  }

  public A(int n){
    super();
    System.out.println("Parameterized constructor of A");
  }
  
  
}

class B extends A{

  public B(int n){
    super();
    System.out.println("Parameterized constructor of B");
  }


  public B(){
    super();  // still if you want to call parameterized constuructor of A the just give an argunent in super --> like this super(4);
    System.out.println("Constructor of B");
  }
}





public class usingSuper {
  public static void main(String[] args) {
      B obj1 = new B(); // this will call the default constructor of A first then default constructor of B
      
      
      B obj2 = new B(3); // this will call the default constructor of A then -> parameterized constructor B


  }
}
