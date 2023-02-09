import java.util.Scanner;
public class hamingdistance
 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a sender message");
      int sender=sc. nextInt();
      System.out.println("enter a receiver message");
      int receiver=sc.nextInt();
      if(sender==receiver)
      {
          System.out.println("there are no corrupted bit and messageis not corrupterd ");
      }
      else
      {
         System.out.println("there arer corruptedd bit and message is not reached properly");
      }

  }    
}
    