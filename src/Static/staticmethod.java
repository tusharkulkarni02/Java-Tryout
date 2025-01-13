
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

  static void show1(){
    System.out.println("This is static method");
    /*
     * Here we can use only static variables but we cannot use instance variable(i.e those variables
     * who dont belong to class and are different for different object, in this case "price" and "brand").
     * 
     * 
     * but what if we wanna use the object variables in a static method.
     * Then we will have to make a static method which has parameter as a object of that class.
     * For ex:
     * 
     * static void show1(Mobile obj){
     *  
     *  System.out.println(obj.brand); // accessing object variable
     * 
     * }
     * 
     */
  }
  public void show(){
    System.out.println("Name :" + name + " Brand : " + brand + "price : " + price);
  }

};




public class staticmethod {
  public static void main(String args[]){
      // Just like static variable can be called without an object , using only the class name
      // Same is valid for static method
      Mobile.show1();
  } 
}
