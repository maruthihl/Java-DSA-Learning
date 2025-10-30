package arrays;

public class RemoveDuplicateArray 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 2, 3, 5};
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++)
         {
            for (int j = i + 1; j < numbers.length; j++) 
            {
                if (numbers[i] == numbers[j]) 
                {
                    numbers[j] = 0; // Mark duplicate as 0
                }
            }
          }
    }
}
