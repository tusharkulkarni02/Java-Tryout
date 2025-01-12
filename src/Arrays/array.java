
//ONLY TWO SYNTAXES TO DECLARE AN ARRAY IN JAVA

// int arr[] = {1,2,3,4,5};
// int arr[] = new int[5];

// MULTI-DIMENSIONAL ARRAYS
// int array2D[][] = new int[3][4]

public class array {
  public static void main(String[] args) {
      int arr[] = new int[4];
      for(int i=0;i<4;i++){
        arr[i] = 4+i;
        System.out.println(arr[i]);
      }
    
      System.out.println();
      // Programme to fill a two dimentional array with random values;
      
      
      int arr2D[][] = new int[3][4];
      
      for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
          int val = (int) (Math.random()*100);
          arr2D[i][j] = val;
        }
      }

      for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
          System.out.print(arr2D[i][j] + " ");
        }
        System.out.println();
      }

      // ENHANCED FOR LOOP or SHORTAND FOR-LOOP or RANGE BASED FOR-LOOP
      System.out.println("Short-hand array: ");
      for(int n[]:arr2D){
        for(int m:n){
          System.out.print(m + " ");
        }
        System.out.println();
      }
      


      System.out.println("Jagged Array:")
      //JAGGED ARRAYS -> Length of each array in a 2D array is different.

      int arrJagged[][] = new int[4][];

      //here, we have to  specifically mention the size of the row arrays.
      //therefore,
      arrJagged[0] = new int[2];
      arrJagged[1] = new int[4];
      arrJagged[2] = new int[7];
      arrJagged[3] = new int[3];
      
      // Setting each value to random value
      for(int rowArr[]:arrJagged){
        for(int i=0;i<rowArr.length;i++){
          rowArr[i] = (int)(Math.random()*100);
        }
      }
      
      // Prining each value of the arrJagged
      for(int rowArr[]:arrJagged){
        for(int number:rowArr){
          System.out.print(number + " ");
        }
        System.out.println();
      }  
    }


    //THREE DIMENSIONAL ARRAY
    
    int arr3D[][][] = new int[3][4][5];


}

//  DRAWBACKS SIZE IS FIXED
//  CONSUMES TIME TO TRAVERSE
//  DOESNOT HAVE THE ABILITY TO STORE DIFFERENT TYPES IN ONE PLACE

// SOLUTION ====> COLLECTIONS