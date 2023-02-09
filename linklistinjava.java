import java.util.*;
public class linklistinjava{
public static void main(String[]args)
{
   LinkedList<Integer> l1=new LinkedList<>();
   LinkedList<Integer> l2=new LinkedList<>();
   l1.add(25);
   l1.add(35);
   l1.add(45);
   l1.add(55);
   l1.add(65);
   l1.add(75);
   l1.add(85);
   l1.add(95);
   l1.add(96);
   l1.add(97);
   l1.add(98);
   l1.add(99);
   l1.addLast(5614);
   l1.addFirst(5615
   );
   
   l2.add(100);
   l2.add(200);
   l2.add(300);
   l2.add(400);
   l2.add(500);
   l2.add(600);
   l2.add(700);
   l2.add(800);
   l2.add(900);
   l2.add(90000);
   l1.addAll(l2);
   for (int i=0;i<l1.size();i++)
   {
       System.out.print(l1.get(i));
       System.out.print(",");
   }

}

}