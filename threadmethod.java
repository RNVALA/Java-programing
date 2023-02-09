class thread1 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println(" i am thread1 of index"+i);
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            i++;

        }
    }
}
class thread2 implements Runnable

{
    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println("i am thred 2 of index "+i);
            i++;
        }
    }
}
public class threadmethod
{
    public static void main(String[]args)
    {
        thread1 ronak=new thread1();
        Thread t1=new Thread(ronak);
        thread2 meet =new thread2();
        Thread t2=new Thread(meet);
       // ronak.start();
      //  try {
        //    ronak.join();
        //} catch (Exception e) {
          //  System.out.println(e);
        //}
       // meet.start();
        t1.start();
        t2.start();


    }
}