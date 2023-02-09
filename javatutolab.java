/*class games{
    public void type()
    {
        System.out.println("indoor&outdoor");
    }
}
class cricket extends games
{public void type()
{
System.out.println("outdoor games");
  }

}

  public class javatutolab{
public static void main(String[] args) {
    games gm=new games();
    cricket ck=new cricket();
    gm.type();
    ck.type();
    gm=ck;
    gm.type();
    

}
}*/
import java.util.Scanner;

import harryproblem.rectangle;
import harryproblem.shape;
import harryproblem.square;
abstract class shape
{
    abstract void area();
}
class rectangle extends shape
{void area()
    {
        System.out.println("rectangle");
    }

}
class square extends shape
{ 
    double a,b,area;

    void setdata(double a1,double b1)
    {
       a=a1;
       b=b1;
    }
    void area()
        {   
            area=a*b;
            System.out.println(area);
        }
    
}
 class javatut
 {
      static public  void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter lenght of shape");
         double a=sc.nextDouble();
         System.out.println("enter breadth of shape");
         double b=sc.nextDouble();
         square s =new square();
         rectangle r=new rectangle();
         s.setdata(a, b);
         s.area();

     }
 }