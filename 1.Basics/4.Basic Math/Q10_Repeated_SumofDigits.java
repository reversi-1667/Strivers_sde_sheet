import java.util.Scanner;

public class Q10_Repeated_SumofDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum1=n%100;
        int sum2=n/100;

        while(sum1>9)
        {
            sum1=sumofdigits(sum1);
            
        }
        while(sum2>9)
        {
            sum2=sumofdigits(sum2);
        }

        int result = sum1+sum2;
        while(result>9)
            result=sumofdigits(result);
        System.out.println(result);

    }

    public static int sumofdigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
}
