import java.util.*;

public class LeksikografskoUrejanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[][] t = new int[n][d];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < d; j++) {
                t[i][j] = sc.nextInt();
            }
        }

        for(int j = d - 1; j >= 0; j--) {
            for(int i = 0; i < n - 1; i++) {
                if(t[i][j] > t[i+1][j]) {
                    int[] tmp = t[i+1];
                    t[i+1] = t[i];
                    t[i] = tmp;

                    // 6 6 2       6 6 2 } zdej to dvoje ni ok
                    // 7 6 2  -->  4 6 3 }
                    // 4 6 3       7 6 2

                    i = -1; // i++ bo dou i na 0 ker rabmo od zacetka spet prevert use vrstice;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(t[i]));
        }
    }
}