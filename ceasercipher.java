import java.util.*;
public class ceasercipher
{
    
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();
 
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                                  s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                                  s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
 
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of plaintext");
        String value=sc.next();
        System.out.println("enter the key that is less than 26");
        int a=sc.nextInt();
        System.out.println("the value of a plain text is: " + value);
        System.out.println("the key of a text is : " + a);
        System.out.println("the value of a cypher tesxt is : " + encrypt(value, a));
    }
}