import java.util.Scanner;

public class Q1_RectangleStarPattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}