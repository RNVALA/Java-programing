 //in abstract class we cannot make object of abstract class
 //or in other class we have to make class abstract or we have to use abstract method
 abstract class parent
 {public parent()
    {
      System.out.println("i am constructer of a base class");
    }
    public void hello()
    {
        System.out.println("hello everybody");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends parent
{  @Override
    public void greet()
    {
     System.out.println("it is default greet method of base class");
    }
    @Override
     
    public void greet2()
    {
     System.out.println("it is greet.of parent class");
    }
    
}
abstract class child2 extends child
{
    public void hi()
    {
         System.out.println("hi");
    }
}

public class abstractherry
{
    public static void main(String[] args) 
    {
     child ronak=new child();
     
     ronak.greet();
     ronak.hello();
     
    }
}
