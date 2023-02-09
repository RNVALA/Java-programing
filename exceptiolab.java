import java.util.*;
class abc extends Exception
{
    abc(String s)
    {
        super(s);
    }

}
class election
{
    void checkage(int age) throws  abc
    {
        if(age<18)
        {
            throw new abc("your age is not aligible for voting");
        }
        else
        {
            System.out.println("you are eligible for voting");
        }
    }
}
public class exceptiolab
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your ege for voting");
    int age=sc.nextInt();
    election  ronak=new election();
    try {
        ronak.checkage(age);
    } catch (Exception e) {
       System.out.println(e);
    }
  }
}