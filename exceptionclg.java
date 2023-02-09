class exceptionclg
{
    public static void main(String[] args)
    {
       try{
           int a=10;
           int b;
           b=a/0;
           System.out.println(b);
       }
       catch(ArithmeticException e)
       {
           System.out.println(e);
           e.printStackTrace();
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println(" array index out of bound");
       }
       catch(Exception e)
       {
           System.out.println("exception is there");
       }
       
    }
}