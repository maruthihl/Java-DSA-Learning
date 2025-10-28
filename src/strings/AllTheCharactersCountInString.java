package strings;

import java.util.Scanner;

public class AllTheCharactersCountInString 
{
 public static void countTheCharacters(String input)
       {
          
           input=input.toLowerCase();
           int alphabet=0;
           int specialCharacter=0;
           int digits=0;
           int space=0;
           for(int i=0;i<input.length();i++)
           {
              char ch= input.charAt(i);
              if(ch>='a'&& ch<='z')
              {
                  alphabet++;
              }
              else if(ch>='0'&& ch<='9')
              {
                  digits++;
              }
              else if(ch==' ')
              {
                  space++;
              }
              else
              {
                  specialCharacter++;
              }
           }
           System.out.println("The number of Alphabet "+alphabet);
           System.out.println("The number of digit "+digits);
           System.out.println("The number of space "+space);
           System.out.println("The number of special character "+specialCharacter);
       }
       public static void main(String[] args)
       {
           Scanner s = new Scanner(System.in);
           System.out.println("enter the sentence to count");
           String input=s.nextLine();
           countTheCharacters(input);
       }

}
