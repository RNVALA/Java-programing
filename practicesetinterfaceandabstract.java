/*abstract class pen
{
    abstract void write();
    abstract void fill();
}
class fountainpen extends pen
{
    void write()
    {
        System.out.println("start writing");

    }
    void fill()
    {
        System.out.println("fill this riffile");
    }
    void changenib()
    {
        System.out.println("changing the nib");
    }
}
public class practicesetinterfaceandabstract{
public static void main(String[] args) 
{
    fountainpen ronak=new fountainpen();
    ronak.changenib();
    ronak.fill();

}}*/
/*
abstract class monkey
{
    abstract public void jump();
    abstract public void bite();
}
interface basicanimal
{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal
{

    @Override
    public void jump() {
        System.out.println("jump");
        
    }

    @Override
    public void bite() {
        System.out.println("bite");
        
    }

    @Override
    public void eat() {
        System.out.println("animal are eating");
        
    }

    @Override
    public void sleep() {
        System.out.println("animal are sleeping");
        
    }

    
}*/
interface tvremote
{
    void poweron();
    void poweroff();
}
interface smarttvremote extends tvremote
{
  void youtubebutton();
  void wifibutton();
}
class remote implements smarttvremote
{
    public void poweron()
    {
        System.out.println("power on the tv");
    }
    public void poweroff()
    {
        System.out.println("power off the button");

    }
    public void youtubebutton()
    {
        System.out.println("youtube starts");
    }
    public void wifibutton()
    {
        System.out.println("wifi starts");
    }
}
public class practicesetinterfaceandabstract
{
    public static void main(String[] args) {
        remote ronak= new remote();
        ronak.youtubebutton();        
    }
}