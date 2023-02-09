import java.util.Scanner;
class myexception extends Exception {
    public myexception(String string) {
    }

    public String toString() {
        return super.toString() + "value cannot be negative";
    }

    public String getMessage() {
        return super.getMessage() + " i am get message";

    }
}

public class throwandthrows {
    public static double area(float r) throws myexception {
        if (r < 0) {
            try {
                throw new myexception("negative");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static double divide(float a, float b) throws ArithmeticException {
        double result = a / b;
        return result;
    }

    public static void main(String[] args) throws myexception {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        float a=sc.nextFloat();
        System.out.println("enter value of b");
        float b=sc.nextFloat();
        try {
            double c = divide(a, b);

            System.out.println(c);
        } catch (Exception e) {
            System.out.println("arithmetic exception a no value cannot dividee by0");
        }
        System.out.println("enter the radius of circle");
        float c=sc.nextFloat();
        area(c);

    }
}
