import java.util.Scanner;
public class Q2_RightAngledTriangle {
    //    Scanner sc= new Scanner(System.in);
//    int n= sc.nextInt();
    public static void main(String[] args) {
//        Q2_RightAngledTriangle a = new Q2_RightAngledTriangle();
//        System.out.println(a.n);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
