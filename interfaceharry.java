// in java interface is a group of relateed method  with empty body
// when we are using interface btween parent to child we are using implements keyword just like we are using extends keyword in
/*import java.util.Scanner;
interface bicycle
{
    void applybreak(int decrement);
    void speedup(int increment);
    
}
interface motorcycle
{
    void fuelconsumption(int fuel);
}
class avoncycle implements bicycle,motorcycle
{   int  speed=7;
   public  int increment;
    void setvalur(int increment)
    {
       this.increment=increment;
    }
   public void applybreak(int decrement)
   {
     speed=speed-decrement;
   }
   public void speedup(int increment)
   {
       speed=speed+increment;
       System.out.println(speed);
   }
   public void fuelconsumption(int fuel)
   {
       System.out.println("your car's petol consumption is so high");
   }
   public void ronakvala()
   {
     System.out.println("hii");
   }

}
public class interfaceharry
{
    public static void main(String[] args) {
        avoncycle ronak=new avoncycle();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter increment speed");
            int increment=sc.nextInt();
      // ronak.setvalur(increment);
            ronak.speedup(increment);
            ronak.ronakvala();
        }

    }
}*/
/*
import java.util.Scanner;
interface add
{
    int a=0;int b=0;
    public void add1(int a,int b);
}
interface sub
{
   int a=0;
   int b=0;
   public void sub1(int a,int b);
}
interface mul
{
 int a=2;
 int b=2;
 public void mul1(int a, int b);
}
class demo implements add,sub{
    public void add1(int a,int b)
    {
        int t=a+b;
        System.out.println(t);
    }
    public void sub1(int a,int b)
    {
        int t=a-b;
        System.out.println(t);
    }
    public void mul1(int a,int b){
        int t=a*b;
        System.out.println(t);

    }
}
class interfaceharry{
    public static void main(String[]args)
    {
        demo ronak=new demo();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
      ronak. add1(a,b);
      ronak.sub1(a,b);
      ronak.mul1(a,b);
    }
}*/
import java.util.Scanner;
interface a
{
    int a=0;
    int b=0;
    public void add(int a, int b);
}
interface a1 extends a
{
    int a=0;
    int b=0;
    public void sub(int a,int b);
    
}
interface a2 extends a{
    int a=0;
    int b=0;
    public void mul(int a, int b);
}
interface a12 extends a1,a2
{
    int a=0;
    int b=0;
    public void div(int a,int b);
}
class b implements a12
{

    @Override
    public void sub(int a, int b) {
       int  t=a-b;
       System.out.println("sub is"+t);
    }

    @Override
    public void add(int a, int b) {
        int t=a+b;
        System.out.println("addition is"+t);
        
    }

    @Override
    public void mul(int a, int b) {
        int t=a*b;
        System.out.println("multiplication is"+t);
        
    }

    @Override
    public void div(int a, int b) {
          int t=a/b;
          System.out.println("division is"+t);
        
    }

}
public class interfaceharry
{
    public static void main(String[]args)
    {  try (Scanner sc = new Scanner(System.in)) {
        int a=sc.nextInt();
        int b=sc.nextInt();
        b ronak=new b();
        ronak.add(a, b);
        ronak.sub(a, b);
        ronak.mul(a, b);
        ronak.div(a, b);
    }
    }
}