class phone 
{
public void pu()
{
    System.out.println("good momrning");
}    
public void name()
{
    System.out.println("my name is ronakvala");
}
}
class smartphone extends phone
{
    public void swagat()
    {
        System.out.println("swagat or welcome to the university");
    }
    public void name()
    {
        System.out.println("my name is meetkumar mori");
    }
}

public class dynamicmethoddispatch
{
    public static void main(String[]args)
    {
        phone obj=new smartphone();//derived class will run not a base class because smartphone ka object hai
        obj.name();
        obj.pu();

    }//jo parent ane child ma hoy same function hoy to child nu run thase .ane same function na hoy bane ma to parent nu ran thase ane child na function no object banavso to error generate thase.
}