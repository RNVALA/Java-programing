/*import java.util.Scanner;
public class array
{
    public static void main(String[] args) {
        //array in reverse order
        int[] marks={26,56,98,78,45,650};
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);        }
    }
}*/
//printing 2d array using for loop
public class array
{
   public static void main(String[]args)
   { 
     int [][]flats=new int [3][3];
     flats[0][0]=101;
     flats[0][1]=102;
     flats[0][2]=103;
     flats[1][0]=201;
     flats[1][1]=202;
     flats[1][2]=203;
     flats[2][0]=301;
     flats[2][1]=302;
     flats[2][2]=303;
     for(int i=0;i<flats.length;i++)
     {
         for(int j=0;j<flats[i].length;j++)
         {
             System.out.print(flats[i][j]);
             System.out.print(" ");

         }
         System.out.println(" ");
     }
   }
}*/
//harry practice question 01
/*public class array{
    public static void main(String[]args)
    {
        float[]marks={24.56f,26.65f,36.25f,65.89f};
        float sum=0;
        for(float element:marks)
        {
           sum=sum+element;
        }
        System.out.println(sum);

        
    }
}*/
/*public class array{
    public static void main(String[]args)
    {
         float[]marks={24.65f,65.32f,45.98f,98.98f};
         float num=45.98f;
         boolean isInArray=false;
         for( float element:marks)
         {  if (num==element) {
             isInArray=true;
             break;

             
         }}
           if (isInArray) {
              System.out.println("number is in array");               
           }
           else
           {
               System.out.println("number is not in the array");
           }
      
    }
}*/
/*public class array{
    public static void main(String[]args)
    {    float average;
        float[] marks={24.0f,35.5f,65.23f,95.25f,65.23f,98.54f};
        float sum=0;
        for (float element : marks) {
            sum=sum+element;
        }
        average=sum  /marks.length;
        System.out.printf("average of this no is%f",average);
    }
}*/

public class array
{
    public static void main(String[] args)
    {
      int[][]mat1={{1,2,3},
                   {4,5,6}};
      int[][]mat2={{6,7,8},
          {9,10,11}};
     int[][]result={{0,0,0},
                     {0,0,0}};
          for(int i=0;i<mat1.length;i++)
          {
              for(int j=0;j<mat1[i].length;j++)
              { System.out.format("setting value fori=%dand j=%d\n ",i,j);
                result[i][j]=mat1[i][j]+mat2[i][j];
              }
              
          }
    

      //printing the element of a 2-d array
       for(int i=0;i<mat1.length;i++)
       {
        for(int j=0;j<mat1[i].length;j++)
        { System.out.print(result[i][j]+" ");
          result[i][j]=mat1[i][j]+mat2[i][j];
        }System.out.println(" ");
    }
      
    }       
}