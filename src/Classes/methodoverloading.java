class Calculator{
  public int add(int a, int b, int c){
    return a+b + c;
  }

  public double add(double a, int b){
    return a+b;
  }

  public void add(){
    System.out.println("Do you wanna perform addittion?");
  }
};
public class methodoverloading {

  public static void main(String a[]){
    
    Calculator calc1 = new Calculator(); // calc1 is not an object of the class Calculator , instead we call it a reference variable here.
    // new Calculator() is what really creates object.
    calc1.add(); // add() method overloaded

    int num = calc1.add(1,3,6);
    System.out.println("Method/function Overloading of integer 1 , 3  , 6 : " + num);
    
    double val = calc1.add(5.34,43);
    System.out.println("The val :" + val);

  }

}
