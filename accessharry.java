
class c1
{
    public int x=5614;
    protected int y=20;
    int z=6;B 
    private int a=78;
     public void meth1()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);//all the access modifier can use in same class
    }
}
    
public class accessharry
{
    public static void main(String[] args) {
        c1 ronak=new c1();
        System.out.println(ronak.x);
        System.out.println(ronak.y);
        System.out.println(ronak.z);
       // System.out.println(ronak.a;  we can not use private  in same packge
    }
}
  
