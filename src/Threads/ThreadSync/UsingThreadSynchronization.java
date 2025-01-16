// Race condition may cause loss or redundent data.
// We can avoid the race condition by thread synchronization.
// Thread Synchronization keeps the thread in sync.
// There is no unwanted updation due to one thread.
// We avoid the concurrent access to a particular data or method using synchronized.
// This method is called Thread Safe.


class Counter{
  public int count = 0;
  public synchronized void increment(){ // Using synchronized makes the method thread-safe and does not cause unwanted mutations.
    count++;
  }
}


public class UsingThreadSynchronization{
  public static void main(String[] args) {
    
      try {
          Counter c =  new Counter();
          
          Runnable obj1  =  ()->{
              for(int i=0;i<1000;i++){
                  c.count++;
              }
          };
          
          Runnable obj2 = ()->{
              for(int i=0;i<1000;i++){
                  c.count++;
              }
          };
          
          Thread t1 = new Thread(obj1);
          Thread t2 = new Thread(obj2);
          
          t1.start();
          t2.start();
          
          
          t1.join(); // Join the threads to the main thread of count.
          t2.join(); 
          
          System.out.println(c.count);
      } catch (InterruptedException ex) {
      }


  }
}
