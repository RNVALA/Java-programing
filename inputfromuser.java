import java.util.Scanner;
public class inputfromuser 
{
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter your marks of maths out of 100");
    int a=sc.nextInt();
    System.out.println("please enter your marks of science out of 100");
    int b=sc.nextInt();
    System.out.println("please enter your marks of social science out of 100");
    int c=sc.nextInt();
    System.out.println("please enter your marks of gujarti out of 100");
    int d=sc.nextInt();
    int e=(a+b+c+d);
    int avgperce=(e*100)/400;
    System.out.print("Average percentage is% ::" );
    System.out.println(avgperce);
    System.out.println(6==6);
    System.out.close();
}
    


    
}

    

