package sets;

import java.util.LinkedHashSet;

public class RemoveDuplicateInString 
{

    public static String removeDuplicates(String input) 
    {

        String remove = "";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            set.add(c);
        }
StringBuilder sb = new StringBuilder();
        for (char c : set)
         {
            sb.append(c);
        }
        return sb.toString();
       
    }
    public static void main(String[] args) 
    {
        String input = "programming";
       String result = removeDuplicates(input);
       System.out.println("String after removing duplicates: " + result);

       
    }
}
