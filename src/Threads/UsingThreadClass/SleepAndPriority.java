
// obj.getPriority() - Lets us see the prioritty of the thread running the obj.
// obj.setPriority() - Lets us set a particular priority.
// Priority can be set manuel or by using constant as Thread.MAXPRIORITY,...etc.



  class A extends Thread{
    public void run(){ 
      for(int i=0;i<10;i++){
        System.out.println("Hello from A");
        try {
          Thread.sleep(10); // This makes the thread wait for 10ms.
        } catch (InterruptedException e) {
          e.printStackTrace();
        } 
      }
    }
  }

  class B extends Thread{
    public void run(){
      for(int i=0;i<10;i++){
        System.out.println("Hi from B");
        try {
            Thread.sleep(5); // Makes the thread wait for 5ms.
            // Goes into a waiting stage.
        } catch (InterruptedException ex) {
        }
      }
    }
  }


public class SleepAndPriority {
  public static void main(String[] args) {
    A obj1 = new A();
    B obj2 = new B();
    
    // We can view or setPriority on a particular thread, for the scheduling algorithm.
     
    // Viewing the priority of the thread running obj1.
    System.out.println(obj1.getPriority());
    
    // Here we are setting the priority of the thread as 6 for obj1.
    obj1.setPriority(6);
  
    obj1.start();
    obj2.start();
  }
}