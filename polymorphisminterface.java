//polymorphism=many forms
interface mycamer
{
    public void takesnap();
    void recordvideo();
   private void notcamera()
    {
     System.out.println("nhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }
  default  void record4kvideo()
      {
          notcamera();
        System.out.println("hello taking video in 4k");
    }
}
interface wifi
{
    String[] getnetwork();
    void connecttonetwork(String network);
}
class mycellphone
{
    void calling(int phonennumber)
    {
        System.out.println("calling"+phonennumber);
    }
    void pickcall()
    {
        System.out.println("pick up call");
    }
}
class smartphone extends mycellphone implements mycamer,wifi
{

    
    public void takesnap() {
        System.out.println("taking snap");
        
    }


    public void recordvideo() {
        System.out.println("taking video");
        
    }
    
    public String[] getnetwork()
    {
      System.out.println("getting list of network");
      String[] networklist={"ronak","meet","krisil"};
      return networklist;
    }
    public void connecttonetwork(String network)
    {
        System.out.println("connecting to"+network);

    } 
 //  public  void record4kvideo()   
   //{
     //  System.out.println("taking snap and capturing video in 4k also");
   //}
     
}
public class polymorphisminterface
{
public static void main(String[]args)
{
//if parent and child have same function then child method will run and if same na hoy bane ma to parent class na j function run thase and child class mate error avse
  mycamer ronak=new smartphone();
   smartphone abc=new smartphone();
  ronak. record4kvideo();
  ronak.takesnap();
  abc.connecttonetwork("ronak");
  
}

}