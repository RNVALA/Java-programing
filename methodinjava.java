/*import java.util.Scanner;
public class methodinjava
{  static int logic(int x,int y)
    {
       int z;
       if(x>y)
       {
           z=x+y;
       }
       else{
           z=x-y;
       }
       return z;
    }
    public static void main(String[]args)
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        c=logic(a,b);//calling mehod using class
        //methodinjava obj=new methodinjava();//calling mehod using object
        //c=obj.logic(a,b);
        System.out.printf("valueof c is %d",c);


    }
}
//if we are calling a method using a object then we are not using static key word otherwise we are using static keyword
*/
//variable argument 
/*public class methodinjava{
 static int sum(int ...array)
 {
    int result=0;
    for(int a:array)
    {
        result+=a;
    } 
    return result;
    
 }    
 public static void main(String[]args)
 {
      System.out.println("the sum of 24 35 36 is:"+sum(24,35,36));
      System.out.println("the sum of teo no25 36 is"+sum(25,36));
      
 }
}*/
//recursion function
/*import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class methodinjava
{  public static int factorial( int n)
    {
    if(n==0||n==1)
    {
        return 1;

    }
    else
    {
     return n*factorial(n-1);

    }}
    public static void main(String[]args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter a no you want to find a factorial");
       int n=sc.nextInt();
       System.out.println("the value of factorial is"+factorial(n));

    }
    

}*///ptint fabonnacci series
/*import java.util.Scanner;
public class methodinjava
{
    public static void main(String[] args) {
    System.out.println("how muchfibbonacci number you want to enter");
    Scanner sc=new Scanner(System.in);
    int count=sc.nextInt();
    int n1=0, n2=1,n3;
    System.out.println(n1+" "+n2);
    for(int i=2;i<count;i++)
    {
        n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;

    }

    }
}*/
//var args
import java.util.Scanner;
public class methodinjava
{

    public static void main(String[] args) {
        float average1;
        System.out.println("enter a nuber");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
         int a=sc.nextInt();  
        }
        average();
        System.out.println(average());
        
    }
    
    static float average(int ...array)
    { int sum=0;
        for (int a : array) 
        {
            sum=sum+a;    
        }
       return sum;
      
   
    }

}