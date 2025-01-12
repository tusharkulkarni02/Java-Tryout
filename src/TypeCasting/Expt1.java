
public class Expt1 {
  public static void main(String[] args) {
    System.out.println("This is java type-casting");

    // GENERALLY, we type cast smaller datatypes in Bigger
    byte b=12;
    int x = (int)b;

    System.out.println("byte b ==> typecasted to integer to hold 12");
    
    

    
    //byte b = 125;

    int a = 257;
    byte k = (byte)a; //here we are typecasting a bigger sized datatype to smaller sized datatype
    // Output value will be k = a%(range of byte i.e 256 (-128 to 127));
    // k = a%256; ==> 1
    // THIS IS WRONG BECAUSE IT LEAKS DATA OR DATA IS LOST!!
    System.out.println("The type-casted value of integer value 275 to byte is " + k); 

  }
}
