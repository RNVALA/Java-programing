import java.util.Scanner;
public class website {
    public static void main(String[] args)
    {  Scanner sc=new Scanner(System.in) ;
       System.out.println("enter a website");
       String website=sc.nextLine();
       if(website.endsWith(".com"))
       {
          System.out.println("this website is commercial website");

       }
       else if(website.endsWith(".in"))
       {
           System.out.println("this website is indian website");

       }
       else if(website.endsWith(".org"))
       {
           System.out.println("this website is organisation website");
       }
    }
    
}
