import java.util.Scanner;
public class Q12_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        int s=1;
        int result;
        System.out.print(f+ " " +s);
        int count=0;
        while(n>0)
        {

            result=f+s;
            System.out.print(result + " ");
            f=s;
            s=result;
            n--;
            count++;

        }
        System.out.println(count);
    }
}
