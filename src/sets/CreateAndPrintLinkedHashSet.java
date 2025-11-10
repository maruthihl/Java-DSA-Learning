package sets;

import java.util.LinkedHashSet;

public class CreateAndPrintLinkedHashSet
 {
     public static void main(String[] args)
      {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // duplicate element
        System.out.println("LinkedHashSet elements: " + set);
       //LinkedHashSetset=new LinkedHashSet<>(); 
     }
}
