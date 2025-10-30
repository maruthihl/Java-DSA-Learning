package strings;

import java.util.Arrays;

public class AnaGram 
{
  public static void anaGram(String input1,String input2)
  {
     input1 = input1.toLowerCase();
     input2 = input2.toLowerCase();
     char[] charArray1 = input1.toCharArray();
     char[] charArray2 = input2.toCharArray();
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);
     boolean result=Arrays.equals(charArray1, charArray2);
     if(result==true)
     {
        System.out.println("AnaGram");
     }
     else
     {
        System.out.println("Not AnaGram");
     }
  }
  public static void main(String[] args) {
    String input1 ="Maruf";
    String input2 ="Furam";
    anaGram(input1, input2);
  }
}