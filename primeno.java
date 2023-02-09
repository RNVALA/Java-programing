import java.util.Scanner;
public class primeno
{
    public static void main(String[] args)
    {
        Scanner Scan =new Scanner(System.in);
        System.out.println("enter a no to verify that it is prime no or not");
        int a=Scan.nextInt();
        int flag=0;
        for(int i=2;i<a/2;i++)
        {
            if(a%i==0){
        
            System.out.println("entered number is not prime...");
           flag=1;
           break;}

        }

    
    if(flag==0)
     {
         System.out.println("entered no is prime");
     }
    }


}