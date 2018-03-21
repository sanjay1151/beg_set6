import java.util.*;

public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int val = 0;
        int n = 0;
        while(num != 0) 
        {
            int digit = num % 10;
            n = n * 10 + digit;
            num /= 10;
        }
        while(n != 0)
        {
            val = n % 10;
            n = n / 10;
            System.out.print(val + " ");
        }
        
    }
}
