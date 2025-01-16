
  // Thread is a smallest unit with which the program can work.
  // A programme in java can utilize multiple or single threads.



  // In this way we inherit the Thread Class, In our class.
  class A extends Thread{
    // Writing the function named "run" is necessary.
    public void run(){ // The name of the method is run() because 
      // it is implemented by the .start() mehtod of the Thread class.
      for(int i=0;i<10;i++){
        System.out.println("Hello from A");
      }
    }
  }

  class B extends Thread{
    public void run(){
      for(int i=0;i<10;i++){
        System.out.println("Hi from B");
      }
    }
  }

  public class UsingThreads{
    public static void main(String[] args) {
      A obj = new A();
      B obj1 = new B();
      
      // Objects of class A and B implement .start() method because it is present in the
      // Thread classs and the classes A and B are child classes of Thread.
      obj1.start();
      obj.start();
    } 
  }
