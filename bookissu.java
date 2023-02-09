import java.util.Scanner;

class library{
    Scanner sc=new Scanner(System.in);
    int n=5;
    String[] books = new String[10];
    library()
    {
        int p=1;
        for(int i=0;i<5;i++)
        {
            books[i]="book"+p;
            p++;
        }
    }
    
    
    void addbook(String book){
        books[n]=book;
        n++;
        System.out.println("the book has been successfully added");
    }
    void issuebook()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(books[i]);
        }
        
        int c=0;
        System.out.println("which book do you wanna issue?");
        String b1 =sc.nextLine();
        // System.out.println(b1);
        for(int i=0;i<n;i++)
        {
            if(books[i].equals(b1))
            {
                // System.out.println("yes");
                break;
            }
            c++;
        }
        // System.out.println(c);
        for(int i=c;i<n-1;i++)
        {
            books[i]=books[i+1];
        }
        n--;
        System.out.println("the book has been successfully issued");
    }
    void returnbook(){
        String b;
        System.out.println("enter the name of the book you want to return.");
        b=sc.next();
        books[n]=b;
        n++;
        System.out.println("the book has been returned successfully");
    }
    void showavailablebooks()
    {
        System.out.println("the available books are: ");
        // for(String b:books)
        // {
        //     System.out.println(b);
        // }
        for(int i=0;i<n;i++)
        {
            System.out.println(books[i]);
        }
    }
}

public class bookissu {
    public static void main(String[] args) {
       library l1=new library();
    //    l1.showavailablebooks();
    //    System.out.println("-----------------------------");
    //    l1.addbook("book10");
    //    System.out.println("-----------------------------");
    //    l1.showavailablebooks();
       l1.issuebook();
    //    System.out.println("-----------------------------");
    //    l1.showavailablebooks();
       l1.returnbook();
       System.out.println("-----------------------------");
       l1.showavailablebooks();
    }
}