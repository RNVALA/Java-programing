import java.util.Scanner;
/**
 * result
 */
public class result {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a marks of maths ");
        int maths=sc.nextInt();
        System.out.println("enter marks of physics");
        int physics=sc.nextInt();
        System.out.println("enter marks of chemistry");
        int chemistry=sc.nextInt();
        float average=((maths+physics+chemistry)*100)/300;
        System.out.println("your perentage in 12 is");
        System.out.println(average);
        if (average>=85&&maths>=33&&physics>=33&&chemistry>=33)
        {
            System.out.println("you got admission in parul university(tfw quota)");
        }
        else if (average>=60&&maths>=33&&chemistry>=33&&physics>=33)
        {
            System.out.println("you got adddmission in parul university (state quota)");
            
        }
         else if(average>=33&&maths>=33&&chemistry>=33&&physics>=33) 
         {
          System.out.println("you got admission in managenment quota and so plz pay donation 0f rs1000000");

        }
        else
        {
            System.out.println("so sorry we can not give admission to you because your marks in 12 is so less !!!!!better luck next time");

        }
    }
}