import java.util.Scanner;
class myexception extends Exception
{
 public String toString()
 {
     return  super.toString()+"i am tostring()";   
}
public String getMessage()
{
    return super.getMessage()+"i am getmessage()";

}
}
public class exceptionclass
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      if(a<99)
      {
          try {
             // throw new myexception();
             throw new ArithmeticException("hello");
          } catch (Exception e) {
            System.out.println(e.getMessage());//print message here hello
            System.out.println(e.toString());// we can write this also by(e)// it will automatically call to string method
            e.printStackTrace();
            
            System.out.println("thanks for visiting my code have a nice day");
          }

      }       
    }
}