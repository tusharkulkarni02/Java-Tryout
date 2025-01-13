// Basically AdvanceCalc inherits BasicCalc
// Here , we have "is-a" relationship
// AdvanceCalc is-a child of BasicCalc
// AdvanceCalc has access to all the data and methods of the parent class


public class AdvanceCalc extends BasicCalc
{
  public int multiply(int a, int b){
    return a*b;
  }  

  public int div(int a, int b){
    return a/b;
  }
}
