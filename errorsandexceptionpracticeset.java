import java.util.Scanner;

/*public class errorsandexceptionpracticeset
{
    public static void main(String[]args)
    {
        try{
          int a;a=5/0;
          
        }
        catch(ArithmeticException e)
        {
            System.out.println("ohho");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("hello");
        }
        finally
        {
            System.out.println("end of program");
        }
        
    }
}*/
public class errorsandexceptionpracticeset {
    public static void main(String[] args) {
        boolean flag=true;
        int []marks=new int[3];
        marks [0]=5;
        marks[1]=10;
        marks[2]=20;
        Scanner sc=new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5)
        { 
             try{
                 System.out.println("enteer a value of a index you want to enter");
            index=sc.nextInt();
            System.out.println("the value of marks is"+marks[index]);
              i++;
            break;}
            
        
        catch(Exception e)
        {
             System.out.println(e); 
             i++;
        }
       finally{
           System.out.println("invalid index");
       }
    

    }
}}