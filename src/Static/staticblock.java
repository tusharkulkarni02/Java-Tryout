
class Mobile{

  String brand;
  int price;
  static String name;
  
  public Mobile(String brand, int price){
    this.brand = brand;
    this.price = price;
    System.out.println("Inside Constructor");
  }

  static{  // declaration of static block in class.
    name = "Tushar's Phone";
    System.out.println("Inside Static Block");
  }
  /*
   * Static block loads when class loads , i.e static block does depends on the instantiation of object.
   * Whenever we, call an object , first class loads and  then obj instantiation takes place.
   * As class loads the static block and variables are also loaded.
   * 
   */


  public void show(){
    System.out.println("Name :" + name + " Brand : " + brand + "price : " + price);
  }

};

// Commented code will only load the class
// We call load a class with the help of a class named "Class" 😶 using a Class.forName("Name of the class you want load") method.

/*

  public class staticblock {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("Mobile");
    }
  }

 */

public class staticblock {
  public static void main(String[] args) {
      Mobile m1 = new Mobile("Apple", 19999);
      Mobile m2 = new Mobile("Samsung", 1999);
      m1.show();
      m2.show();
  }
}
