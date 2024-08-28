import java.util.*;

public class MaksimumPoStolpcih {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int s = sc.nextInt();

        int[][] t = new int[v][s];

        for(int i = 0; i < t.length; i++) {
            for(int j = 0; j < t[0].length; j++) {
                t[i][j] = sc.nextInt();
            }
        }

        int[] izhod = new int[s];

        for(int j = 0; j < s; j++) {
            int max = t[0][j];
            for(int i = 1; i < v; i++) {
                if(t[i][j] > max) {
                    max = t[i][j];
                }
            }
            izhod[j] = max;
        }

        System.out.println(Arrays.toString(izhod));
    }
}