package exception;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class CompileTimeException 
{
public static void main(String[] args) {
    try{
 FileReader fr = new FileReader("maruthi.txt");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Multiple catch block trying"+e.getMessage());
    }
    catch(FileNotFoundException e)
    {
        System.out.println("File not found"+e.getMessage());
    }
     catch(Exception e)
    {
        System.out.println("Third exception"+e.getMessage());
    }
    finally
    {
        System.out.println("Execution completed");
    }
}
}
