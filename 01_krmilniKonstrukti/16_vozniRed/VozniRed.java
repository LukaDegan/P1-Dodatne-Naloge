import java.util.Scanner;

public class VozniRed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d = sc.nextInt();

        int cas1 = h1 * 60 + m1;
        int cas2 = h2 * 60 + m2;

        for(int i = cas1; i <= cas2; i+=d) {
            System.out.printf("%02d:%02d\n", i/60, i%60);
        }
    }
}