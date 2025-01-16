// The collection Interface are present in java.util package. thus we need to import it.

import java.util.*;


// We can define different data structures/
// Collection, List, Set, Arraylist, etc
// List,Queue,Set implements the Collection Interface.



public class UsingCollectionInterface{
  public static void main(String[] args) {
    


    List<Integer> nums = new ArrayList<Integer>(); // Here we used Integer instead of Int because , Integer class is a wrapper for int primitive.
    nums.add(5);
    nums.add(54);
    nums.add(76);
    nums.add(9);

    for(int n:nums){
      System.out.println(n);
    }

    System.out.println("The index of 54 is : " + nums.indexOf(54));
    System.out.println("Getting the value at index 1:" + nums.get(1));
    
    Collection<Integer> ArrLis = new ArrayList<Integer>();
    ArrLis.add(23);
    ArrLis.add(86);
    ArrLis.add(650);

    // for(int n:ArrLis){
    //   System.out.println(n);
    // }

    // OR

    Iterator<Integer> itr = ArrLis.iterator();
    
    while(itr.hasNext()){
      System.out.println(itr.next());
    }



  }
}
