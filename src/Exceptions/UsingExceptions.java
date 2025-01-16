


public class UsingExceptions {
  public static void main(String[] args) {
    int x = 43;
    String str = null;
    int arr[] = new int[5];
    
    try {
        int res  = 234/x;
        int len = str.length();
        int val = arr[5];
    } catch(ArithmeticException e){
      System.out.println(e +"divide by zero error!"); 
    }catch(NullPointerException e){
      System.out.println("Your are finding the value of null porinter" + e);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Your arr not in the limits of arr" + e);
    }
    catch (Exception e) {
    }
  }
}
