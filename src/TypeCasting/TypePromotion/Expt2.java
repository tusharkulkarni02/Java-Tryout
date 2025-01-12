public class Expt2 {
  public static void main(String[] args) {
      
    byte a = 10;
    byte b = 30;

    int result = a*b;
    System.out.println(result);
    /* HERE,
     * we are multiplying two byte values, the result will be 300
     * but 300 does not fit in byte a max-positive value of byte is 127
     * So, Java will internally promote the multiplied value 
     * to the value bigger than byte.
     * THIS IS TYPE PROMOTION!
     * 
     *  
      Type Promotion in Java

      Java has automatic type promotion in many scenarios, especially when working with expressions involving mixed types.

      1. Primitive Type Promotion in Expressions
      Smaller data types (byte, short, char) are automatically promoted to int during operations.

      If the operation involves int and another type like float, the result is promoted to the "wider" type (float in this case).

      Example:
      byte a = 10;
      byte b = 20;
      int c = a + b; // `a` and `b` are promoted to int before the operation
      
      2. Widening Type Conversion
      Java supports implicit widening conversions when assigning a value of a smaller type to a larger type. Example:

      int a = 10;
      float b = a; // Implicit conversion from int to float
      
      Supported widening conversions:
      byte → short → int → long → float → double
      char → int

      3. Narrowing Type Conversion (Explicit Cast Required)
      If you need to assign a larger type to a smaller type, you must explicitly cast it. Example:

      float a = 10.5f;
      int b = (int)a; // Explicit cast from float to int
     */
  }
}
