package strings;

public class Palindrome
{
    public static String reverseString(String input)
    {
        String reversed="";
        for(int i=input.length()-1;i>=0;i--)
        {
            reversed= reversed+input.charAt(i);
        }
       return reversed;
    }
    public static boolean isPalindrome(String input)
    {
       String reverse = reverseString(input);
        return reverse.equals(input);
    }
    public static void main(String[] args) 
    {
       String input="madam";
       if(isPalindrome(input))
       {
           System.out.println(input+" is a palindrome");
       }
       else
       {
           System.out.println(input+" is not a palindrome");
       }
    }

    
}
