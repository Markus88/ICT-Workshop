package workshop.basic.programming.i;

/**
 * @author patricklange
 * This is a Thread Demo. Code inspired from the internet.
 */
public class ThreadDemo {
    public void RunThreadDemo()
   {
      MyThread mt = new MyThread ();
      mt.start ();
      System.out.println("--- Starting Threading! ---");
      for (int i = 0; i < 50; i++)
           System.out.println ("i = " + i + ", i * i = " + i * i);
   }
}

class MyThread extends Thread
{
   @Override
   public void run ()
   {
      for (int count = 1, row = 1; row < 20; row++, count++)
      {
           for (int i = 0; i < count; i++)
                System.out.print ('*');
           System.out.print ('\n');
      }
   }
}
