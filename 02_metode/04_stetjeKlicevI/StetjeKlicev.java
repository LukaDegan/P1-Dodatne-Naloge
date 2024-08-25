import java.util.*;

public class StetjeKlicev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int rez = f(a, b, n);
        System.out.println(rez);       
    }

    public static int f(int a, int b, int n) {
        if(n == 0) {
            return 1;
        } else {
            return (1 + f(a, b, n/a) + f(a, b, n/b));
        }

    }
}