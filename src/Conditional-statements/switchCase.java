public class switchCase {
  public static void main(String[] args) {
      /*
       * One way to analyze cases is using if-else if-else ladder
       * 
       * if(n==1){
       * 
       * }else if(....){
       * 
       * }else if(...){
       * 
       * }else{
       * 
       * }
       * 
       * Smart way is to use switch cases
       */

       int n  = 1;
  
       switch(n){
          case 1:
            System.out.println("monday");
          case 2:
            System.out.println("tuesday");
          case 3:
            System.out.println("wednesday");
          case 4: 
            System.out.println("thrusday");
          case 5: 
            System.out.println("friday");
          case 6:
            System.out.println("saturday");
          default:
            System.out.println("Sunday");
       }


       // when a match is found in switch then , entire cases below it executes
       // if we dont want to do that then use break;

       /*
        * switch(n){
          case 1:
            System.out.println("monday");
            break; ---> stops the exection flow and programme below is not executed
          case 2:
            System.out.println("tuesday");
            break;
          case 3:
            System.out.println("wednesday");
            break;
          case 4: 
            System.out.println("thrusday");
            break;
          case 5: 
            System.out.println("friday");
            break;
          case 6:
            System.out.println("saturday");
            break;
          default:
            System.out.println("Sunday");
       }

       There is also a special way to achieve this in java
       */
  }
}
