/* class employee{
    int salary;
    String name;
    public void setname(String n)
    {
        name=n;
    }
    public void setsalary(int s)
    {
        salary=s;
    }
    public int getsalary()
    {
        return salary;
    }
    public String getname()
    {
        return name;
    }
}
public class classpracticeprob {
public static void main(String[]args)
{
  employee ronak=new employee();
  ronak.setname("GOOD MORNING ALL OF YOU");
  System.out.println(ronak.getname());
  ronak.setsalary(150000);
  System.out.println(ronak.getsalary());
}}*/
/*import java.util.Scanner;
class cellphone
{public void vibrating()
    {
        System.out.println("your mobile phone is vibrating");

    }
    public void ringing()
    {
        System.out.println("yoour mobile phone is ringing");
    }
    public void calling()
    {
        System.out.println("your mobile phone is calling with a friend");
    }
}

public class classpracticeprob
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        cellphone asus=new cellphone();
        if (a==1)
         {
            asus.calling();
        }
        else if (a==0) {
            asus.vibrating();
        } else {
            asus.ringing();
        }
    }
}*/
//create a class square with a method to initialise its side,calculating area ,paremeterexc
/*import java.util.Scanner;
class square
{int side,parimeter ,area;
    public void setside(int s)
    {
        side=s;
    }
    public int area()
    {
        area=side*side;
        return area;
    }
    public int perimeter()
    {
        parimeter=4*side;
        return parimeter;
    }
}
public class classpracticeprob
{
public static void main(String[]args)
{
System.out.println("enter a side of square");
Scanner sc=new Scanner(System.in);
int side=sc.nextInt();
square  square1=new square();
square1.setside(side);
square1.area();
System.out.println(square1.area());
square1.perimeter();
System.out.println(square1.perimeter());
}
}
*////create a class perimter and find area and perimeter of rectangle
/*import java.util.Scanner;
class rectangle
{    int lenght,bredth,perimeter,area;
    public void setside(int l,int b)
    {
       lenght=l;
       bredth=b;
    }
    public int perimeter(int lemght,int breadth)
    {
        perimeter=(lemght*breadth
        )*2;
        return perimeter;    }
    public int area(int lemght,int breadth)
    {
        area=lemght*breadth;
        return area;
    }
    
}
public class classpracticeprob
{
    public static void main(String[] args) {
        System.out.println("enter a lenght of rectangle");
        Scanner sc=new Scanner(System.in);
        int lenght=sc.nextInt();
        System.out.println("enter breadth of a rectangle");
        int breadth=sc.nextInt();
        rectangle rectangle1=new rectangle();
        rectangle1.setside( lenght, breadth);
        rectangle1.perimeter(lenght,breadth);
        rectangle1.area(lenght,breadth);
        System.out.println(rectangle1.perimeter(lenght,breadth));
        
    }
}*/
//create a class tommyvecetti for rockstar games capable of (print hitting),running,firing exc
class tommyvecetti
{
    public void hitting()
    {
        System.out.println("car heated by vehicle");
    }
    public void running()
    {
        System.out.println("car is running");
    }
    public void firing()
    {
        System.out.println("car is firing");
    }
}
public class  classpracticeprob
{
    public static void main(String[]arg)
    {
        tommyvecetti ronak=new tommyvecetti();
        ronak.hitting();
        ronak.running();
        ronak.firing();
    }
}