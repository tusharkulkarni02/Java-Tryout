
@FunctionalInterface
interface A{
  int add(int i,int j);
}

// Note = Lambda functions only work with functional interfaces.

public class Lambdafunctions {
  public static void main(String[] args) {
    A obj = (i,j) -> i+j;
    /*
      You can also do -----> A obj = (i,j) -> {
                                        return i+j;
                                      };


     * The background will be like , - creating a annonymous class
     *                               - then defining the add function
     * 
     * A obj = new A(){
     *    public void add(int a, int b){
     *      return a+b;  
     *    }
     * }
     * 
     * 
     * 
     * Note: Dont compare it with Js arrow functions.
     */

     int res = obj.add(3,4);
     System.out.println("The result is  : " + res);
     
  }  
}


/*
 * Types of interfaces:
 * 
 * 1: Normal -> It is Normal
 * 2: Functional Interface (Single Abstract Method (SAM)) -> This is a Interface which has only one method.
 * 3: Marked Interface -> Give permissions. Used in serialization or deserialization memory blocks.
 */