package patternPrinting;

public class InterviewQuestion
 {
    public static void main(String[] args)
     {
        int number=8;
        int rows=4;
        for(int i=0;i<rows;i++)
        {
            number=8;
            for(int j=rows;j>i;j--)
            {
                System.out.print(number);
                number-=2;
                
            }
            System.out.println();
        }

    }
}

 
