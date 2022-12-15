import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int i;
        if (n == 1) {
            System.out.println("Prime starts from 2");
        }
        //checking the prime number
        for (i = 2; i < n; i++) {
            if (n % i == 0)
                System.out.println(n + " is not a prime number");
            break;
        }
        //prime or not
        if (n == i)
            System.out.println(n + " is a prime number");
    }
}