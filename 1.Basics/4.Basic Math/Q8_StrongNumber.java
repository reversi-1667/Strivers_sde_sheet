import java.util.Scanner;
public class Q8_StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int number=strong_number(n);
        if(n==number)
            System.out.println("This is a strong number");
        else
            System.out.println("this is not a strong number");
        sc.close();

    }
    public static int strong_number(int no)
    {
        int digit;
        int sum=0;
     while(no>0)
     {
         digit=no%10;
         sum=sum+factorial(digit);
         no=no/10;
     }
     return sum;
    }

    public static int factorial(int n)
    {
        int fact=1;
        while(n>0)
        {
            fact=fact*n;
            n--;
        }
        return fact;
    }
}
