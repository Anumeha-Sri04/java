import java.util.*;
public class func_to_add {
    public static void sum(int a,int b)
    {   int sum=0;
        sum=a+b;
        System.out.println("Sum of two numbers="+sum);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers whose sum is to be calculated");
        int a=sc.nextInt();
        int b= sc.nextInt();
        sum(a,b);
    }
}
