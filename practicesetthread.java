class thread1 extends Thread{
    public void run()
    {   int i=0;
        while(i<20)
        {
            System.out.println("good morning");
           /* try{
                Thread.sleep(200);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }*/
            i++;
        }
    }
}
class thread2 extends Thread{
    public void run()
    {   int i=0;
        while(i<20)
        {
            System.out.println("good afternoon");
           
            i++;
        }
    }
}
public class practicesetthread
{public static void main(String[]args)
    
{
    thread1 ronak=new thread1();
    thread2 meet=new thread2();
    ronak.setPriority(Thread.MAX_PRIORITY);
    meet.setPriority(Thread.NORM_PRIORITY);
    System.out.println(ronak.getState());
    System.out.println(ronak.getPriority());
    System.out.println(meet.getPriority());
    ronak.start();
    meet.start();
    System.out.println(meet.getState());
    System.out.println(Thread.currentThread().getState());
}}