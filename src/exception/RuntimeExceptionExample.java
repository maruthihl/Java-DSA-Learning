package exception;

public class RuntimeExceptionExample
 {

    public static void main(String[] args) 
    {
        int a=10;
        int b=0;
        int result;
        
        //System.out.println(result);
        try
        {
            result=a/b;
            System.out.println("Result is: "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        finally
        {
            System.out.println("Execution completed");
        }
        
        
    }
}
