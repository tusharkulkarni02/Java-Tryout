
//  FUNCTIONAL INTERFACE IS A INTERFACE IN WHICH WE CAN ONLY DECLARE ONE MEHTOD.

@FunctionalInterface // using this annotation checks that only one method is defined in functtional interface
interface A{
  void show();
}
// class B implements A{
//   public void show(){
//     System.out.println("In B");
//   }
// }
public class UsingFunctionalInterface{
  public static void main(String[] args) {
    A obj = new A(){
      public void show(){
        System.out.println("In show of annonymous obj");
      }
    };
    obj.show();
  }  
}
