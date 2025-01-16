import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * About finally block,
 * It is written at the end of the try-catch blocks.
 * finally block runs irrespective of the issuse or no issues in the above block.
 * Generally used to close the resourses , eg: BufferedReader and Scanner.
 * Finally Block can be used whenever we want a piece of code to run anyhow.
 */

public class usingFinally {
  public static void main(String[] args) throws IOException {
      /*
       * WE CAN IMPLEMENT TRY-CATCH-FINALLY BLOCKS WHILE TAKING INPUTS.
       * More formally we are gonna use TRY-FINALLY combination.
       */
      
      // int num = 0;
      // BufferedReader br = null;
      // try {
      //   InputStreamReader input = new InputStreamReader(System.in);
      //   br = new BufferedReader(input);
      //   num = Integer.parseInt(br.readLine());
      //   System.out.println(num);
      // } 
      // finally{
      //   br.close();
      // }

    
      //  THE ABOVE WAY IS VERY INTUTIVE AND SIMPLE, BUT THERE IS ANOTHER WAY WHICH IS SHORT
    
      // Auto closing of resources.
      // HERE, We execute teh bufferedreader operation in try blocks arguments.
      // We also dont have to write the finally block to close the resources

      //  THIS IS TRY WITH RESOURCES.
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
      {
        int num = Integer.parseInt(br.readLine());
        System.out.print(num);
      }
  }
}
