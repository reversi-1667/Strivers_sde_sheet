import java.util.Scanner;

public class Q10_Recursive_Repeated_SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = n % 100;
        int sum2 = n / 100;

        sum1 = reduceToSingleDigit(sum1);
        sum2 = reduceToSingleDigit(sum2);

        int result = reduceToSingleDigit(sum1 + sum2);
        System.out.println(result);
    }

    // Recursive function to sum digits until only  a single digit will be left
    public static int reduceToSingleDigit(int n) {
        if (n < 10) {
            return n;
        }
        return reduceToSingleDigit(sumOfDigits(n));
    }

    // Recursive function to calculate the sum of digits
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}

