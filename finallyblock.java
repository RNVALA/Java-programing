public class finallyblock
{
    public static int greet()
    {
        try{
            int a=6;
            int b=2;
            int c=a/b;
            return c;
        }
        catch(Exception a)
        {
            System.out.println(a);
        }
        finally{//finally block will run in any case if exceptioncome or not
            System.out.println("this is end of a program thank you for using this code");
        }
        return 0;
    }
    public static void main(String[]args)
    {
       int k= greet();
        
        System.out.println(k);
        int a=10;
        int b=2;
        while(true)
        { try{
            System.out.println(a/b);
        }
            catch(Exception e)
            {
                System.out.println(e);
                break;
            }
            finally 
            {
                System.out.println("program over thanks for using");

            }
            b--;
        }
    }
}