import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the range:.........");
        int range = scn.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.println(n1);
        System.out.println(n2);
        //Adding a and b
        for (int i = 2; i <= range; i++)    // loop started from 2 bcoz 0 and 1 already printed
        {
            n3 = n1 + n2;
            //printin the fibonacci series
            if (n3 <= range) {
                System.out.println(n3);
                n1 = n2;
                n2 = n3;
            }
        }

    }
}