
// Parent--------> Child ---------> GrandChild
// BasicCalc----> AdvanceCalc----> VeryAdvCalc
public class VeryAdvCalc extends AdvanceCalc{ // Achieving multi-level inheritance through VeryAdvCalc
  public double power(int a, int b){
    return Math.pow(a,b);
  }
}
