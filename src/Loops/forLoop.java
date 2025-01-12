public class forLoop {
  public static void main(String[] args) {
      for(int i=0;i<5;i++){
        System.out.println("The i is: " + i);
      }
      System.out.println();

      // NOTE: When we do this System.out.println(" " + 5 + 3); ===> the output will be 53;
      // To get the addition do this -> System.out.println(" " + (5+3));
      
      for(int i=1;i<=7;i++){
        System.out.println("Day " + i);
        for(int j = 0;j<9;j++){
          int val1 = 9 + j;
          int val2 = val1+1;
          if(val2<12){
            System.out.println(" " + (val1) + "-" + (val2) + "AM");
          }else if(val2==12 || val1==12){
            System.out.println(" " + (val1) + "-" + (val2) + "PM");
          }else{
            System.out.println(" " + (val1%12) + "-" + (val2%12) + "PM");
          }
        }
      }

  }
}
