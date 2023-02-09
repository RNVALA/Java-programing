import java.util.Scanner;
class mythread1 extends Thread
{
    public mythread1(String name)
    {
        super(name);
    }
    public void run()
    {  int i=1;
        while(i<20)
        {
            System.out.println("my name is ronak i am from parul university");
            i++;
        }
    }
}
public class threadconstructer
{
    public static void main(String[]arg)
    {   Scanner sc =new Scanner(System.in);
        System.out.println("enter your name");
        String a=sc.next();
        String b=sc.next();
        mythread1 ronak=new mythread1(a);
        mythread1 meet =new mythread1(b);
        ronak.start();
        meet.start();
        System.out.println("the id of the thread is"+ronak.getId());
        System.out.println("the  thread name of String is"+ronak.getName());
        System.out.println("the id of obj2 thread is"+meet.getId());
        System.out.println(" your thread name of obj 2 is"+meet.getName());

    }
}