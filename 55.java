import java.util.*;

public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int prd = n * m;
        if((prd % 2) == 0)
        {
            System.out.println("Even");
        }
        else 
        {
            System.out.println("Odd");
        }
        
    }
}
