import java.util.ArrayList;

import java.util.*;
public class collection {
    public static void main(String[]args)
    {
    ArrayList<Integer> l1=new ArrayList<>();
    ArrayList<Integer> l2=new ArrayList<>(5);
    l2.add(100);
    l2.add(250);
    l2.add(350);
    l2.add(450);
    l2.add(550);
    l2.add(650);
   
    l1.add(0,25);
    l1.add(0,20);
    l1.add(30);
    l1.add(40);
    l1.add(0,50);
    l1.add(60);
    l1.add(70);
   // l1.addAll(3,l1);
  // l1.ensureCapacity(20);
  System.out.println(l1.contains(550));
  System.out.println(l1.indexOf(5220));

    
    for(int i=0;i<l1.size();i++)
    {   System.out.println("hello");
        System.out.println(l1.get(i));
        //System.out.print(",");
    }
    }
    
}
