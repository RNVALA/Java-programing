import java.util.Scanner;
import java.util.Random;
public class paperscissergame
{public static void main(String[] args) {
    //0 for rock
 // 1 for paper
 // 2 for scisser
 Scanner sc=new Scanner(System.in);
 System.out.println("enter 0 for rock ,1for paper,2 for rock");
 int userinput=sc.nextInt();
 Random random=new Random();
 int computerinput=random.nextInt(3);
 if(userinput==computerinput)
 {
     System.out.println("DRAW!!!!!!!!");
 } 
 else if(userinput==0 && computerinput==2||userinput==1&&computerinput==0||userinput==2&& computerinput==1)
 {
     System.out.println("!!congratulation you win the game");
 }
 else
 {
     System.out.println("sorry  you lose the game and computer won the game");

 }
    System.out.printf("computer choice is %d",computerinput);
}
}
  
 
