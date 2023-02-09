
public class garbagecollection {
    public void finalise()
     { 
        System.out.println("garbage collection performed");
    }
    public static void main(String[]args)
    {
       garbagecollection ob1=new garbagecollection();
       garbagecollection ob2=new garbagecollection();
       ob1.finalise();
       ob2.finalise();
       System.gc();

    }
}
