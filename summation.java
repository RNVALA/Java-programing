public class summation {
    static int sum(int ...array)
 {
    int result=0;
    for(int a:array)
    {
        result+=a;
    }
    return result;
    
 }    
 public static void main(String[]args)
 {
      System.out.println("the sum of 24 35 36 is:"+sum(24,35,36));
      System.out.println("the sum of teo no25 36 is"+sum(25,36));
      System.out.println("the sum of  63 25 25 45 25 "+sum(63,25,25,45,25));
      
 }
    
}
