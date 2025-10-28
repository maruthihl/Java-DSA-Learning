package strings;

public class Reverse 
{
    public static void main(String[] args) 
    {

       String  input="Hello";
       System.out.println("reversed string is: "+reverseString(input));
    }
    public static String reverseString(String input)
    {
        String reversed="";
        for(int i=input.length()-1;i>=0;i--)
        {
            reversed= reversed+input.charAt(i);
        }
       return reversed;
    }
    
}
