import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a income per annum");
        float income = sc.nextFloat();
        float tax = 0;
        if (income <= 2.5f) {
            tax = tax + 0;
        }
         else if(income>2.5f&&income<=5.00)
         {
            tax=tax+0.05f*(income-2.5f);
        }
        else if(income>5.00f&&income<=10.0f)
        {
            tax=tax+0.05f*(5.00f-2.5f);
            tax=tax+0.2f*(income-5.00f);
        }
        else if(income>10.00f)
        {
           tax=tax+0.05f*(5.00f-2.5f);
           tax=tax+0.2f*(10.00f-5.00f);
           tax=tax+0.3f*(income-10.00f);
        }
         System.out.println("the total tex payable is "+tax);
    }

}
