
// final keyword can be used for variables , class and function/methodss.



public class usingFinal {
  // final in java is equivalent const in c++
  
  // If we use final with a variable , then its value cannot be changed.
  public final int num = 12345; 

  
}


// If we use final with class no one can inherit it.
final class A{

}


// if We use final with method , no one can overrride it.

class X{
  public final void show(){
    System.out.print("This final method of class x");
  }

}

class Y extends X{
  public void show(){ // This will give error that : show() in Y cannot override show() in X overridden method is final.

  }
}