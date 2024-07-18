import java.util.*;
public class conditionalstate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of friend");
        int opt = sc.nextInt();
//        if (opt == 1)
//            System.out.println("Hello");
//        else if (opt == 2)
//            System.out.println("Namaste");
//        else if (opt == 3)
//            System.out.println("Bonjour");
        //using switch
        switch(opt)
        {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("the number specified is not in range");
                break;

        }

    }
}


