import java.util.Scanner;

public class UrejanjeTrojice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));

        int mid = a + b + c - max - min;
        System.out.printf("%d %d %d\n", min, mid, max);
    }
}