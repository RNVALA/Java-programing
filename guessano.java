import java.util.Scanner;
import java.util.Random;
class game
{
	int count=0;
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	int a =rand.nextInt(100);
	public void play()
	{
		while(count<10)
		{
			System.out.printf("you have %d chances left",10-count);
            System.out.println("enter a number");
			int num=sc.nextInt();
			if(num==a)
			{
				System.out.println("congratulation you have found the match");
				System.out.printf("you took %d moves",10-(10-count));
				break;

			}
			if(num>a)
			{
				System.out.println("enter a lower number");
			}
			else{
				System.out.println("enter higher numbmer");

			}
			count++;
		}
		sc.close();
	}

}
public class guessano
{
	public static void  main(String[]args)
	{
     game g=new game();
	 g.play();

	}
}