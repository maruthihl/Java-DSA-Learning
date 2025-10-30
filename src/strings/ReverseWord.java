package strings;

public class ReverseWord 
{
 public static String reverse(String input)
  {
    String rev="";
    String[] words = input.split(" ");
   for(int i=0;i<words.length;i++)
   {
         for(int j=words[i].length()-1;j>=0;j--)
         {
             rev= rev+words[i].charAt(j);
         }  
         rev=rev+" ";
   }
    return rev;
  }
  public static void main(String[] args) {
    String input="Hello World";
    System.out.println("Reversed word string is: "+reverse(input));
  }
}
