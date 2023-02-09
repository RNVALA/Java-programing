class oddeven extends Thread
{
    oddeven(String s)
    {
          super(s);
    }

public void run()
{
    String tname=Thread.currentThread().getName();
    int oddc=1,evenc=0;
    for(int i=0;i<50;i++)
    {
        if(tname.equals("0dd"))
        {
            System.out.println(tname+" "+oddc);
            oddc=oddc+2;
        }
        if(tname.equals("even"))
        {
            System.out.println(tname+" "+evenc);
            evenc=evenc+2;
        
        }
    }
}}
public class threadoddeven
{
    public static void main(String[]args)
    {
        oddeven t1=new oddeven("odd");
        oddeven t2=new oddeven("even");
        t1.start();
        t2.start();
    }
}
