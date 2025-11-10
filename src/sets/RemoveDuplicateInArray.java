package sets;

import java.util.LinkedHashSet;

public class RemoveDuplicateInArray 
{
    public static void main(String[] args) 
    {
        int []arr={10,20,30,20,40,10,50};
        System.out.println("Array after removing duplicates:");
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        for (Integer number :arr )
         {
            set.add(number);
        }
        System.out.println(set);
    }

}
