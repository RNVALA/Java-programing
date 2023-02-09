/*import java.util.Scanner;
class myemployee
{private int id;
 private String name;
 public String getname()
 {
     return name;
 }
 public void setname(String n)
 {
     name=n;
 }
 public void setid(int i)
 {
     id=i;
 }
 public void getid()
 {
     System.out.println (id);
 }
}
public class oopsch
{
    public static void main(String[]args)
    {  Scanner sc=new Scanner(System.in);
       myemployee ronak=new myemployee();
       System.out.println("enter your name");
       String name=sc.nextLine();
       System.out.println("enter your id");
       int id=sc.nextInt();
       ronak.setid(id);
       ronak.getid();
       ronak.setname(name);
       System.out.println(ronak.getname());


    }
}*/
import java.util.Scanner;
class employee
{
    private int id;
    private String n;
    public employee()
    {
     System.out.println("default argument runned");  
    }
    public employee(String n,int i)
    {

    }
}
public class oopsch{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("enter id");
        int id=sc.nextInt();

    }
}