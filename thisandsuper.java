/*class demo {
    int a,b;
    static  int c=20;
    demo(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int getval1()
    {
        return a;
       
    }
    public int getval2()
    {
        return b;
    }
    public static int getvalue3()
    {
        return c;
    }
    static{
        System.out.println("hello welcome to the java programing");
    }
    
}
public class thisandsuper
{
 public static void main(String[]args)
 {
    demo ronak=new demo(45,63);
    System.out.println(ronak.getval1());
    System.out.println(ronak.getval2());
    demo.c=30;//we are asssining value to the static method by classname.variable
    System.out.println(demo.getvalue3());//we are calling static method by classname.methodname()

 }}//we are using static method in this program
*/

/*
class parent
{
     void show()
    {
       System.out.println("i am from parent class");
    }
}
class child extends parent {

     void show()
    {   super.show();
        System.out.println("i am from child class");
    }
}
public class thisandsuper
{public static void main(String[] args) {
    child ronak=new child();
    ronak.show();
}}*/


class a
{
     a()
    {
        System.out.println("i am default constructer of class a ");
    }  
     a(int a,int b)
    {
        System.out.println("i am parameterized constructer of class a or parent class");
    }
}
class b extends a{
     b()
    {  super();
        System.out.println("i am defqault constructer of b or base class");
    }
    b(int a,int b)
    {   super(a,b);
        System.out.println("i am parameterized constructer of class b");
    }
}
public class thisandsuper
{
    public static void main(String[]args)
    {
        b ronak=new b(25,30);
        
    }
}