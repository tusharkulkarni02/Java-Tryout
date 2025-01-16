
// We can also create a our own exception class like this.
class TusharException extends Exception{
  public TusharException(String str){ // Making the constructor
    super(str); // using super calling the super class.
  }
}


public class UsingThrow{
  public static void main(String[] args) {
    int i = 0;
    try {
      int res = i/23423;
      if(i==0){
        throw new TusharException("You are giving 0, I dont want zero!."); // Using throw we can throw some errors. Along wutth that errror we can also send text and datta.
      }   
    }
    catch(TusharException  e){
      System.out.println(e);
    }
    catch (Exception e) {
      System.out.println("Something went wrong!!!");
    }
  }
}

/*
 * Output
 *  PS D:\Java\Learning\src\Exceptions\Throw> javac -d bin UsingThrow.java
    PS D:\Java\Learning\src\Exceptions\Throw> java -cp bin UsingThrow     
    TusharException: You are giving 0, I dont want zero!.
 */