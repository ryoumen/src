import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number. ");
        } else {
            System.out.println(number + " is not a prime number. ");
        };

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % 1 == 0) {
                return false;
            }
        }

        return true;
    }

}
