import java.util.Scanner;

class cylinder {
    private int height;
    private int radius;

    //public void set(int radius, int height) {
      //  radius = radius;
        //height = height;
    //}
   public  cylinder(int radius,int height)
    {
        height=height;
        radius=radius;
    }
    public void surfacearea(int radius,int height)
    {
        double surfacearea=3.14*(radius*radius)*height;
        System.out.println("the surface area is ");
        System.out.println(surfacearea);

    }
    public void volume(int radius,int height)
    {
        double volume=(2*3.14*radius*height)+2*3.14*(radius*radius);
        System.out.println("the volume of a cylinder is ");
        System.out.println(volume);

    }
}


public class accessmodifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a height of a cylinder");
        int height=sc.nextInt();
        System.out.println("enter a radius of a cylinder");
        int radius=sc.nextInt();
         cylinder myCylinder=new cylinder(radius, height);
       // cylinder myCylinder = new cylinder();
       // myCylinder.set(radius,height);
        myCylinder.surfacearea(radius,height);
        myCylinder.volume (radius,height);



    }
}
