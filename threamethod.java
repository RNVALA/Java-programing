class mythread implements Runnable
{   @Override
    public void run()
     {  int i=1;
         while(i<4000){
     System.out.println("my thread is running ");
     System.out.println("i am happy");
     i++;
    }
     }
    }

class thread2 implements Runnable
{
    @Override
    public void run()
    {   int i=1;
        while(i<4000)
        {
            System.out.println("my thredding is excellent");
            System.out.println("i am very happy$ thanks");
            i++;
        }
    }
}
public class threamethod
{
    public static  void main(String[]arg)
    {mythread ronak= new mythread();
        Thread t1=new Thread(ronak);
      thread2 meet= new thread2();
         Thread t2=new Thread(meet);
      t1.start();
      t2.start();

    }
}