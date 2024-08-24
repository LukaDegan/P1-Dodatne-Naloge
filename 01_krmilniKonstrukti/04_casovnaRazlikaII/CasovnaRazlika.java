import java.util.Scanner;

public class CasovnaRazlika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        int cas1 = h1*60 + m1;
        int cas2 = h2*60 + m2;

        System.out.printf("%d:%02d\n", (cas2-cas1) / 60, (cas2-cas1) % 60);
    }
}