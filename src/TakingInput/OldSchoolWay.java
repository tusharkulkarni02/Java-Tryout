
// To take input from the user you have to import these classes compulsorily.
import java.io.BufferedReader; // For bufferedreader most important class.
import java.io.IOException; // For IOExcepions.
import java.io.InputStreamReader; // Main thing for input.

public class OldSchoolWay {
  public static void main(String[] args) throws NumberFormatException, IOException {
    System.out.println("Enter a number:");

    InputStreamReader input = new InputStreamReader(System.in); // The InputStreamReader constructor requires the Object "in" from InputStream , which is already present in System class, thats why System.in.
    BufferedReader bf =  new BufferedReader(input); // The BufferedReader constructor requirs a in object. "input" is an object of InputStreamReader class.

    int num = Integer.parseInt(bf.readLine()); // bf.readLine() method returns a string of input.
    System.out.println(num);

    //BufferredReader is actually a rresourrce, Hence we shuld close the BufferedReader and follow best practices.
    bf.close();
    
  }
}
