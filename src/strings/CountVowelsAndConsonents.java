package strings;
public class CountVowelsAndConsonents 
{
    public static void count(String input)
    {
        int vowels=0;
        int consonents=0;
        input=input.toLowerCase();
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowels++;
            }
            else 
            {
                consonents++;
            }
        }
        System.out.println("vowels: "+vowels);
        System.out.println("consonents: "+consonents);
    }
    public static void main(String[] args) 
    {
        String input="hello";
        count(input);
    }
}