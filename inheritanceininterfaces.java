interface parent
{
    void math1();
    void math2();
}
interface child extends parent{
    void math3();
    void math4();
}
class mysampleclass implements child{
   public  void math1()
    {
        System.out.println("math1");
    }
    public void math2()
    {
        System.out.println("math2");
    }
    public void math3()
    {
        System.out.println("math3");
    }
    public void math4()
    {
        System.out.println("math4");
    } 
}
public class inheritanceininterfaces
{
    public static void main(String[]args)
    {
        mysampleclass ronak=new mysampleclass();
        ronak.math1();
        ronak.math2();
        ronak.math3();
        ronak.math4();
    }
}
