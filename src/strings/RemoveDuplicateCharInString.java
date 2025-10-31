package strings;

public class RemoveDuplicateCharInString
{
  public static String removeDuplicateChar(String input)
  {
    String result="";
    for(int i=0;i<input.length();i++)
    {
        char ch=input.charAt(i);
       if(!result.contains(""+ch))
       {
           result+=ch;
       }
    }
    return result;
  }
    public static void main(String[] args) 
    {
        String input="programming";
        System.out.println("String after removing duplicate characters: "+removeDuplicateChar(input));

    }

}
