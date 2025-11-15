package polymorphisam;

public class MethodOverloading 
{
   public static void login(String username, String password)
   {
       System.out.println("Login with username and password");
   }
   public static void login(String email)
   {
       System.out.println("Login with email");
   }
   public static int login(long phoneNumber, int otp)
   {
       System.out.println("Login with phone number");
       return 1;
   }
   public static void main(String[] args) 
   {
     // MethodOverloading mg = new MethodOverloading();
        MethodOverloading.login("marut", "1234");
        MethodOverloading.login("marut@example.com");
        MethodOverloading.login(1234567890L, 1234);
        
   }

}
