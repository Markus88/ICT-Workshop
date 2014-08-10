package workshop.basic.programming.i;

/**
 * @author patricklange
 */
public class ThreadDemo2 implements Runnable {
   private Thread t;
   private final String threadName;
   
   // Constructor
   ThreadDemo2( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
   
   /* 1. <----
   As a first step you need to implement a run() method provided by 
   Runnable interface. This method provides entry point for the thread 
   and you will put you complete business logic inside this method. 
   Following is simple syntax of run() method:
   */
   @Override
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(500);
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
     }
     System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start ()
   {
      System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }

}
