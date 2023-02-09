 class base {
     base()
     {
         System.out.println("i am a constructer");
     }
     base(int x)
     {
         System.out.println("i am overloaded constructer ofmbase class with value of x"+x);
     }
    
}
class derived extends base
{
    derived()
    
    {//super(0);
        System.out.println("i am derived clsss constructer");
    }
    derived(int x,int y)
    {   super(x);  
          System.out.printf("i am overloaded constructer of derived with a value  of x as%d and y as%d ",x,y); 
         System.out.println("");
    }
}
class childofderived extends derived{
    childofderived()
    {
        System.out.println("i am a child of a derived class");

    }
    childofderived(int x,int y,int z)
    {  // super(x, y);
        System.out.printf("i am  achild of a derived class and i am taking argument as x=%d,y=%d,and z=%d",x,y,z);
    }
}

public class inheritanceconstructer
{
    public static void main(String[] args) {
        //derived ronak=new derived();
        //derived ronak=new derived(50,100);
        childofderived ronak=new childofderived(25,30,35);
         
    }
}