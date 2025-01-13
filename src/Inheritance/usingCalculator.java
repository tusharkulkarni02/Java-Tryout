public class usingCalculator {
  public static void main(String[] args) {
      VeryAdvCalc vac = new VeryAdvCalc();
      int num1 = vac.multiply(3, 4);
      int num2 = vac.div(41, 2);
      int num3 = vac.add(num1, num2); // here we are accesing the parent class methods through child class obj.
      int num4 = vac.sub(num1, num2);

      double num4RaiseToNum3 = vac.power(num4,num3);

      
      System.out.println("num1 : " + num1 +  " num2 : " + num2 +  " num3 : " + num3 +  " num4 : " + num4);
      System.out.println("num4RaiseToNum3 : " + num4RaiseToNum3);
  }  
}

// num1 : 12 num2 : 20 num3 : 32 num4 : -8
// num4RaiseToNum3 : 7.922816251426434E28
