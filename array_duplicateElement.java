import java.util.*;
public class arr1 {

    public static int greatest(int b[],int n)
    {
        int g=b[0];
        for (int i=0;i<n;i++)
        {
            if(g<=b[i])
            {
                g=b[i];
            }
        }
        return g;
    }

    public static int smallest(int b[],int n)
    {
        int min=b[0];
        for(int i=0;i<n;i++)
        {
            if(min>=b[i])
            {
                min=b[i];
            }
        }
        return min;
    }
//checks if a number in array has been repeated twice.
    //prints the duplicated number
    public static void duplicate(int b[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(b[i]==b[j])
                {
                    System.out.println("the duplicate is found of "+b[i]);
                    break;
                }
            }

        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements of array");
        for(int i=0;i<size;i++)
        {
             arr[i]=sc.nextInt();
        }

            System.out.println("choose an option \n 1 for finding greatest number in a given array \n 2 for finding the smallest number in given array");
            System.out.println(" 3 for printing the number in an array which has been repeated twice");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    int greatestNumber = greatest(arr, size);
                    System.out.println("the greatest number of the array= " + greatestNumber);
                    break;
                case 2:
                    int minimum = smallest(arr, size);
                    System.out.println("the smallest number of the array= " + minimum);
                    break;
                case 3:
                    duplicate(arr, size);
                    break;
                default:
                    System.out.println("none of the options are valid");
                    break;
            }

    }
}
