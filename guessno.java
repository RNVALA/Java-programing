import java.util.Scanner;
import java.util.Random;
class game
{  
    public int number;
    public int inputnumber;
    public int noofguesses;

    public int getnoofguesses()
    {
        return noofguesses;
    }
    public void setnoofguesses(int noofguesses)
    {
        this.noofguesses=noofguesses;
    
    
    }
      game()
    {
        Random rand=new Random( );
        number=rand.nextInt(100);
    }
    //void userinput()
    //{
      //  Scanner sc=new Scanner(System.in);
       //int   inputnumber=sc.nextInt();
    //}
    boolean iscorrectnumber(int inputnumber) 
    {
        if(inputnumber==number)
        {
            return true ;
        }
        else if(inputnumber<number)
        {
            System.out.println("too less enter a higher no");
        }
        else if(inputnumber>number)
        {
            System.out.println("no is too high enter a lower number");
        }
        return false;
    }  
} 
 public class guessno
 {
     public static void main(String[]args)
     {   Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
          game ronak=new game();
         // ronak.userinput();
          boolean b=ronak.iscorrectnumber(num );
          
     }
 }