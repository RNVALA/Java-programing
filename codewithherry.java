//print a number using function
/*import java.util.Scanner;
public class codewithherry {
    public static void multipilcation(int n)
    {
       for(int i=1;i<=10;i++)
       {
           System.out.printf("%d*%d=%d",n,i,n*i);
           System.out.println("");
       }
    }
    public static void main(String[]args)
    {
        System.out.println("enter no which you want to find table of that no");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        multipilcation(a);

    }
}*/
//to print star
/*import java.util.Scanner;
public class codewithherry
{
    public static void  star(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many times you want to print star");
        int a=sc.nextInt();
        star(a);
    }
}*/
//print sum of n natural no using recursive function
//logic=1+2+3+4+5+6+7+8+9.......=(n-1)+n
/*import java.util.Scanner;
public class codewithherry
{
    public static int nnaturalno(int n)
    {
       if(n==1)
       {
           return 1;
       }
       return n + nnaturalno(n-1);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("how mach natural no you want to print");
        int a=sc.nextInt();
        nnaturalno(a);
        System.out.print(nnaturalno(a));
    }
}*/
//program to 
/*****
***
**
**/
/*import java.util.Scanner;

import javax.xml.stream.events.StartDocument;
public class codewithherry
{
    public static void star(int a)
    {
        for(int i=a;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a no you want to print star");
       int v=sc.nextInt();
         star(v);
         
    
    }
}*/
