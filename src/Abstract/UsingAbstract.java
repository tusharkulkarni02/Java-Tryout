// Abstract key word when used on a method, enables to intitalize in the current class. No need to declare that method in the current class.
// Note that current class should also be abstract.
// Major Note : Abstract class can exist without abstract methods but abstract methods cannot exist without abstract class.
// If make a inherited class of a abstract class, you must declare the abstract methods present in that class.
// If a child class does not declare all the abstract methods of the parent abstract class, then the child class also becomes abstract class.

// You cannot create an object of abstract class.
// You will have to create a child class/ subclass which implements all the methods of the abbstract class
// Then you can call the object of teh sub class


abstract class Car{
    abstract public void drive();
    abstract public void fly();
    
    public void playMusic(){
      System.out.println("Playing Music 🎶🎶🎶🎶🎸🎹🎺🎼");
    }
}

abstract class WagonR extends Car{
  public void drive(){
    System.out.println("WagonR is being driven!");
  }
}


class AdvancedWagonR extends WagonR{
  public void fly(){
    System.out.println("Advaned WagonR can also fly!!! ✈️");
  }
}



public class UsingAbstract {
  public static void main(String[] args) {
      AdvancedWagonR obj = new AdvancedWagonR();
      obj.drive();
      obj.fly();
      obj.playMusic();
  }  
}
