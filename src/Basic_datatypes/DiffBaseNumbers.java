
public class DiffBaseNumbers {
  public static void main(String[] args) {
      int num1 = 0b101; // binary representation of 5
      // this is 5 in decimal format

      int num2 = 0x7E; // Hexadecimal representation of a number

      int num3 = 10_00_00_00; // Underscore helps to group the zeros for clear counting

      System.out.println("The decimal representation of binary Num1 = 0b101 is " + num1 );

      System.out.println("The Decimal rep of the Hexadecimal num2 is " + num2);
      
      System.out.println("The number with and without underscores between zeros is same: 10_00_00_00 <=> " + num3);
  }
}
