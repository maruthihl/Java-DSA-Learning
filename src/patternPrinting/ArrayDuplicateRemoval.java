package patternPrinting;

import java.util.Arrays;

public class ArrayDuplicateRemoval
 {
    public static void main(String[] args)
     {
        int []arr={1,2,3,3,4};
        Arrays.sort(arr);
      
        for(int i=0;i<arr.length;i++)
        {
              boolean duplicateFound = false;
            for(int j=i+1;j<arr.length;j++)
            {
               if(arr[i]==arr[j])
               {
                   
                   duplicateFound = true;
               }
            }
             if(!duplicateFound)
       {
           System.out.println(arr[i]);
       }
            
        }
      
    }
}
