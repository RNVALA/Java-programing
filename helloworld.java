import java.util.Scanner ;
class helloworld
{
    public static void main(String[]args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("please enter your first number");
        int a=Sc.nextInt();
        System.out.println("please enter your second number");
        int b=Sc.nextInt();
        int sum=a+b;
        System.out.println("your answer is");
        System.out.println(sum);
        Sc.close();
    }
}