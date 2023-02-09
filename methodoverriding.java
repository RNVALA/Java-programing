  class a
  {
      public void math()
      {
          System.out.println("i from ckass a and mathof class a");
      }
      public void hello()
      {
        System.out.println("hello java i am learning");
      }
      public void helth()
      {
        System.out.println("my health is good i am fine");
      }

  }
  class b extends a{
    public void math()
    {
      System.out.println("i am from class b");
    }

  }
  public class methodoverriding
  {
    public static void main(String[]args)
    {
      b s=new b();
      s.math();
      s.hello();
    }
  }//here method one is overriden .