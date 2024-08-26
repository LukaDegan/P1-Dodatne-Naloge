import java.util.*;

public class NajboljseSeme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        long max = 0;
        int seme = 0;

        for(int s = a; s <= b; s++) {
            Random rand = new Random(s);
            long st = 0;
            for(int i = 1; i <= n; i++) {
                st *= 10;
                st += rand.nextInt(10);
            }
            if(st > max) {
                max = st;
                seme = s;
            }
        }

        System.out.println(seme);
    }
}