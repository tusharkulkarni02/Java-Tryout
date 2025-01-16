// Under the map interface there are various methods like HashMap and HashTable.
// HashTable is by default synchronized.
// For HashMap you have to use synchronized externally to make it synchronized.


import java.util.HashMap;
import java.util.Map;


public class UsingMap {
  public static void main(String[] args) {
    Map<String, Integer> student = new HashMap<>();

    student.put("Alex", 46);
    student.put("Donald", 98);
    student.put("Mark", 43);
    student.put("Jack", 87);  

    student.replace("Jack", 90);

    for(String name: student.keySet()){
      System.out.println(name + " : "+ student.get(name));
    }


  }
}
