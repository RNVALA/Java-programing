import java.util.Scanner;
class circle
{   int r,height;
    double area;
    double areacylinder;
     void setradius(int r,int height)
    {
       this.r=r;
       this.height=height;

    }
   public double areaofcircle()
    {
      area=3.14*(r*r);
      return area;
    }
}
class cylinder extends circle
{
public double  areaofcylinder()
{
   areacylinder=(2*3.14*r*height)+(2*3.14*r*r);
   return  areacylinder;
}
}
class praticeset
{
  public static void main(String[]args)
  {  Scanner sc=new Scanner(System.in);
      cylinder ronak=new cylinder();
      System.out.println("enter radius of circle and height of cylinder");
       int r=sc.nextInt();
       int height=sc.nextInt();
       ronak.setradius(r, height);
       System.out.format("area of circle is %f",ronak.areaofcircle());
       System.out.println("");
       System.out.format("area of cylinder id %f",ronak.areaofcylinder());

  }
}