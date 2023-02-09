//hierarical inheritance
/*class a{

    float salary = 40000;
    }
    class b extends a{
    double hike = 0.5;
    }
    class c extends a{
    double hike = 0.35;
    }
    public class javalab
    {
    public static void main(String args[]){
    b obj1 = new b();
    c obj2 = new c();
/    // All objects of inherited classes can access the variable of class Employee
    System.out.println("Permanent Employee salary is :" +obj1.salary);
    System.out.println("Hike for Permanent Employee is:" +obj1.hike);
    System.out.println("Temporary Employee salary is :" +obj2.salary);
    System.out.println("Hike for Temporary Employee is :" +obj2.hike);
    }
    }*/
    //overriding
    /*class a
    {
        void show()
        {
            System.out.println("   class parent");
        }
    }
    class b extends a
    { void show()
        {
            System.out.println("class base");
        }
       

    }
    public class javalab
    {
        public static void main(String[]args)
        {
            b obj=new b();
            a obj1=new a();
            obj1.show();
            obj.show();
            
        }
    }*/
    class games{
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
public class javalab{
    public static void main(String[] args) {
        games gm=new games();
        cricket ck=new cricket();
        gm.type();
        

    }
}}