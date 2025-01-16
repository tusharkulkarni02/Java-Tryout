
// In java enum is a class, It is a user defined datatype.
// collection of named objects


enum Status{
  Running,Success,Pending,failed;// objects of class status.
}


public class UsingEnum {
  public static void main(String[] args) {
    
    Status ss[] = Status.values();
    int n = ss.length;

    for(Status s:ss){
      System.out.println(s + " : " + s.ordinal());
    }


    Status s = Status.Running;

    switch(s){
      case Running -> System.out.println("All Good");
      case Success -> System.out.println("Done");
      case failed -> System.out.println("try Again");
      default -> System.out.println("done");
    }
  }
}
