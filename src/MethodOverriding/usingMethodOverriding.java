class A{
  public int add(int a, int b){
    return a+b;
  }
}


class B extends A{
  public int add(int a,int b){
    return a+b+34109844;
  }
}
public class usingMethodOverriding {
  public static void main(String[] args) {
    B obj = new B();
    System.out.println(obj.add(2,4)); // The code will override the add method of A with add method of B
  }
}
