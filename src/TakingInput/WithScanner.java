
import java.util.Scanner;



public class WithScanner{
  public static void main(String[] args) {
    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in); // Scanner takes constructor from in object of InputStream Class, present in System Class
    int num = sc.nextInt(); // Scanner class has verious methods. .nextInt() is one of them.
    System.out.println(num);
    sc.close();
  }
}
