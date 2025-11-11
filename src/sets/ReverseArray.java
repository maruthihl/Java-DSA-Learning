package sets;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class ReverseArray
 {
    public static void main(String[] args)
     {
         String input="Java is fun";
         String[] words = input.split(" ");
        List<String> wordList = Arrays.asList(words);
        Collections.reverse(wordList);
        String result = String.join(" ", wordList);
        System.out.println("Reversed array string is: " + result);
    }
   

}
