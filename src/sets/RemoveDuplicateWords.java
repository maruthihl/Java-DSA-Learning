package sets;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords 
{
public static void main(String[] args) 
{
    String input="java is a programming language and java is also a platform";
   String[] words = input.split(" ");
   LinkedHashSet<String> set= new LinkedHashSet<>(Arrays.asList(words));
   String result = String.join(" ", set);
   System.out.println("String after removing duplicates: " + result);

    
}
}
