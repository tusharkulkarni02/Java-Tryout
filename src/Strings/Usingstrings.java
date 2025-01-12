
// By default, Strings are Immutable in java. i.e their values cant be changed after declaration.
// To use Mutable functionality for string , 
// Two Options: 1) String Buffer
//              2) String Builder




public class Usingstrings {
  public static void main(String[] args) {
    
    String name = "Tushar"; // Creates a memory location in heap, which contains "Tushar"
    // name points to that memory location
    /*
     * This is similar to --->  String name = new String("Tushar");
     */

     name = name + "Kulkarni"; // Concatenates Tushar and Kulkarni
     // This creates a new memory location and name will point to the new memory i.e contain new adderess
     // Previous memory location will be ready for GARBAGE COLLECTION.


    StringBuffer sb = new StringBuffer("Matthew");
    System.out.println(sb.capacity());
    // sb.capacity() outputs 23 as 7(size of i/p string) + 16(default allocated size)

    StringBuffer new_sb = sb.append("Hayden"); // appending Hayden to Matthew

    sb.insert(1,"mongoose"); // inserts mongoose from index 1 in the sb.
    // result will be MmongoosetthewHayden

    System.out.println(sb);

    boolean result = sb == new_sb; // This will result "true" here
    // Because StringBuffer is mutable and updates in the same memory location.

    System.out.println(result);

    // diff stringbuffer methods
    System.out.println(sb.charAt(2));
    System.out.println(sb.deleteCharAt(6));


    sb.setLength(30); // SETS THE LENGTH OF sb to 30

    sb.ensureCapacity(100); // Everytime allocates a minimum of 100 bytes for stringBuffer


  }  
}

/*
 * DIFF BETWEEN STRINGBUFER AND STRINGBUILDER, STRINGBUFFER IS THREADSAFEE , STRINGBUILDER IS NOT.
 */
