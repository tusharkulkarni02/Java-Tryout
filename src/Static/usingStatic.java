class Mobile{
  
  // instance variable
  String brand;
  int price;

  // static variable
  static String name; 
  /*
   * Static variable belongs to a class.
   * It is only declared once. i.e It has same memory location throughout differentt objects.
   * Static variable if changed reflect everywhere , wherever it is used.
   * Static variable is not dependent on object. Can be called without object initialisation
   * Static variable is shared by all the objects.
   * Static variable should be accessed usiing the class name only.
   * eg: Mobile.name;
   */

   public void show(){
    System.out.println("Name : " + name + "," + "price : " + price + " brand:" + brand);
   }
};




public class usingStatic {
  public static void main(String[] args) {
      
    Mobile m1 = new Mobile();
    m1.brand = "Samsung";
    m1.price = 19999;
    m1.name = "Tushar's Phone"; // here we are setting the name as Tushar's Phone
    // This happens with warning as we are accessing static variable name using object m1 instead of classname Mobile
    // The proper access should be Mobile.name = "Tushar's Phone";


    Mobile m2 =  new Mobile();
    m2.brand = "Apple";
    m2.price = 69999;
    // Here we didnt een access name, because we need not to declare static variable with same name for every object.

    System.out.println("Before Change the value of static variable{name}:");
    m1.show();
    m2.show();

    System.out.println("After Change the value of static variable{name}:");
    
    Mobile.name = "Phone of Tushar";

    m1.show();
    m2.show();


  }
}

/*
 * output:
 * Before Change the value of static variable{name}:
Name : Tushar's Phone,price : 19999 brand:Samsung
Name : Tushar's Phone,price : 69999 brand:Apple
After Change the value of static variable{name}:
Name : Phone of Tushar,price : 19999 brand:Samsung 
Name : Phone of Tushar,price : 69999 brand:Apple  
 */