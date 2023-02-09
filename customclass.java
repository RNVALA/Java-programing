 class employee {
    int id;
    String name;
    int salary;
    void showingdetails()
    {
        System.out.println("my id is"+id);
        System.out.println("my id is "+name);
    }
     int getsalary()
    {
        return salary;
    
    }




    
}
public class customclass
{
    public static void main(String[] args)
     { System.out.println("this is our custom class");
       employee ronak=new employee();
       ronak.id=10;
       ronak.name="my name is ronak";
       ronak.showingdetails();
       ronak.salary=12;
       int salary=ronak.getsalary();
       System.out.println(salary);

        
    }
}
