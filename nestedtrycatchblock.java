 import java.util.Scanner;
 public class nestedtrycatchblock 
{
    public static void main(String[] args) 
    {
        int []marks=new int[3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of index");
        boolean flag=true;
        while(flag){
        int ind=sc.nextInt();

        try{
            System.out.println("welcome to java programing");
            try
            {
                System.out.println(marks[ind]);
                flag=false;
            } 
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("array out of bound level2");
            }
            
        }
        catch(Exception e)
        {
                 System.out.println("array index is out of bound 1");
        }}
        System.out.println("thanks for using my code have a  nice  day");
    }
}
