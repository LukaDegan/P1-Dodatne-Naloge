import java.util.*;

public class StetjeKlicev {

    /*
    isti program kt pr metodah sam da je dodana memoizacija
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int[] memo = new int[n+1];

        int rez = f(a, b, n, memo);

        int stKlicev = 0;
        for(int i = 0; i < memo.length; i++) {
            if(memo[i] != 0) {
                stKlicev++;
            }
        }
        
        System.out.println(stKlicev);       
    }

    public static int f(int a, int b, int n, int[] memo) {
        memo[n]++;
        if(n == 0) {
            return 1;
        } else {
            return (1 + f(a, b, n/a, memo) + f(a, b, n/b, memo));
        }

    }
}