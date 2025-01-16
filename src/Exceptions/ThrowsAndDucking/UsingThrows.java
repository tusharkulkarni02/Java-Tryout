// This is the main class where the program starts
public class UsingThrows {

  // This method simulates a risky operation that can throw a checked exception.
  // The `throws` keyword indicates that this method "ducks" the responsibility
  // of handling the exception and passes it to the caller.
  public static void readFile(String filePath) throws java.io.FileNotFoundException {
      // Simulate a file read operation that may fail
      if (filePath == null || filePath.isEmpty()) {
          throw new java.io.FileNotFoundException("File path cannot be null or empty!");
      }
      System.out.println("Reading file at: " + filePath);
  }

  // Another method that also "ducks" the exception by declaring it with `throws`.
  // It doesn't handle the exception but relies on the caller to manage it.
  public static void processFile(String filePath) throws java.io.FileNotFoundException {
      readFile(filePath); // Calls the risky operation
      System.out.println("File processing completed.");
  }

  // The main method serves as the entry point of the program.
  // Here we finally handle the exception using a try-catch block.
  public static void main(String[] args) {
      String filePath = ""; // Test with an empty file path to trigger the exception

      // Exception handling is done at the top-most level of the method call hierarchy.
      try {
          processFile(filePath); // Call the method that ducks the exception
      } catch (java.io.FileNotFoundException e) {
          // Catch and handle the exception gracefully
          System.out.println("Error: " + e.getMessage());
      }
  }
}


