// Using interfaces provides loose coupling of classes and methods of the classes implementing it.
// Makes an application more flexible.

interface Computer{
  void code();
}


class Laptop implements Computer{
  public void code(){
    System.out.println("codingg  via Laptop");
  }
}

class Desktop implements Computer{
  public void code(){
    System.out.println("Coding via Desktop");
  }
}

class Developer{
  public void devApp(Computer obj){
    obj.code();
  }
}

public class NeedForInterface {
  public static void main(String[] args) {
    Computer lap = new Laptop(); // Assignign laptop obj to reference of  interface c1.
    
    Developer tushar = new Developer();
    tushar.devApp(lap);

    Computer desk = new Desktop();// assignig Desktop() obj to c1 ref.
    tushar.devApp(desk);
  }  
}
