
// The stream api give the implementation, common methods like ForEach(), Map(), Filter(), Reduce().

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UsingForEach {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(23,54,76,97,90,12);

    // Three ways to traverse the array.

    // for(int i=0;i<nums.size();i++){
    //   System.out.println(nums.get(i));
    // }

    // for(int n:nums){
    //   System.out.println(n);
    // }

    nums.forEach((n)->System.out.println(n)); 

    // WHAT ACTUALLY HAPPENS IN THE BACKGROUND OF A forEach(),  ELLABORATIVELY

    /*
     * Consumer<Integer> com = new Consumer<Integer>(){
     *  public void accept(Integer n){
     *    System.out.println(n);
     *  }
     * }
     * 
     * nums.forEach(com);
     * 
     * forEach() is a method which accepts an object of Consumer Interface. 
     * The Interface has a method named accept, whose job is to accept the data passed onto it.
     * Consumer is a Functional interface. Therefore, works Arrow implementation;
     * 
     * Consumer<Integer> com = (n) -> System.out.println(n);
     * 
       Not the com object can be replaced by the statement in the forEach() method.

       thus we get, nums.forEach((n) -> System.out.println(n));
     */


     // NOW FOCUS ON STREAM API.
     // The stream api helps to handle the given input in a safe and secure manner.
     // That is we created new copies of the data and does not operate on the existing data.
     // The data is collected by the stream.
     // Onec the data stream is used we cannot use it again.
     // Hence we achieve a secure processing of data.


     Stream<Integer> s1 = nums.stream(); // With the help of nums.stream() method we convert all the list into a stream.
     // Now, we can use different method on the stream.
     Stream<Integer> s2 = s1.filter(n->n%2==0); // filter 
     Stream<Integer> s3 = s2.map(n->n*2); // map
     int res = s3.reduce(0,(c,e)-> c+e); // reduce returns a single value. mostly integer.

     // Second way
    // The second way is more intutive and readable.
     int output = nums.stream()
                  .filter(n->n%2==0)
                  .map(n->n*2)
                  .reduce(0,(c,e)->c+e);

     System.out.println(res);

     Stream<Integer> strm = nums.stream()
                                .filter(n -> n%2==0)
                                .sorted();

     strm.forEach(n->System.out.println(n));
  }
}
