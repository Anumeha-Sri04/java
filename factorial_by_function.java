import java.util.*;
public class factorial {
    public static int calculateFactorial(int n)
    {
        double p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*i;
        }
        return (int)p;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number whose factorial is to be calculated");
        int n=sc.nextInt();
        int fact=calculateFactorial(n);
        System.out.println("the factorial of " +n+" is = "+fact);
    }
}
