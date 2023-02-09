import java.util.Scanner;
/*public class star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter  a no that  you want to print star");
         int num=sc.nextInt();
         for( int i=num;i>0;i--)
         {
            for(int j=0;j<i;j++)
            {
                System.out.print("  *");
            }
            System.out.print("\n");
         }
    }
    
}*/
/*public class star{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter how much even no you want to sum ");
       int num=sc.nextInt();
       int sum=0;
       for(int i=0;i<num;i++)
       {
           sum=(sum+(2*i));
       }
       System.out.println(sum);

    }
}*/
/*public class star
{
    public static void main(String[]args)
    {  Scanner sc=new Scanner(System.in);
      System.out.println("which table you want to enter");
      int num=sc.nextInt();
      for(int i=1;i<=10;i++)
      {
          System.out.printf("%d*%d=%d\n",num,i,num*i);
      }
    }
}*/
/*public class star
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter which no factorial you want to find");
       int num=sc.nextInt();
       int factorial=1;
      //5*4*3*2*1
       for(int i=1;i<=num;i++)
       {
           factorial=factorial*i;
       }
       System.out.printf("factorial of a no %d is %d",num,factorial);
    }
}*/
/*public class star
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter which no factorial you want to find");
       int num=sc.nextInt();
       int i=1;
       int factorial=1;
       while (i<=num) {
           factorial=factorial*i;
           i++;
       }
       System.out.printf("%d factorial is %d",num,factorial);
    }
}
*/
/*public class star{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("how much star you want");
       int num=sc.nextInt();
       int i=num;
       while (i>0) {
           int j=0;
           while (j<i) {
               System.out.print("*");
               j++;
               
           }
           System.out.print("\n");
           i--;
       }
    }
}*/
 public class star{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("which table addition you want");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++)
        {   
            sum=sum+(num*i);
        }
         System.out.printf("%d table sum is%d",num,sum);
    }
}