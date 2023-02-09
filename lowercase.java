import java.util.Scanner;
/**
 * lowercase
 */
public class lowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter any string");
       //String name= sc.next();
      // System.out.println(name.toLowerCase());
      // System.out.println(name.toUpperCase());
      String name= sc.nextLine();
     // System.out.println(name.trim());
     //System.out.println(name.substring(3));
     // System.out.println(name.substring(2, 8));
    System.out.println(name.replace("<|name>|","ronak"));
   // System.out.println(name.startsWith("ro"));
     //System.out.println(name.endsWith("he"));
    // System.out.println(name.indexOf("sa"));
    

    }

    
}