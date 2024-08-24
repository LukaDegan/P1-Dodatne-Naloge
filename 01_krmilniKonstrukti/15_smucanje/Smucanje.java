import java.util.*;

public class Smucanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int indeks = 0;
        int cas = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++) {
            int cas1 = sc.nextInt();
            if(cas1 != 0) {
                int cas2 = sc.nextInt();
                if(cas2 != 0 && cas1 + cas2 < cas) {
                    cas = cas1 + cas2;
                    indeks = i;
                }
            }
        }

        if(cas == Integer.MAX_VALUE) {
            System.out.println("NIHCE");
        } else {
            System.out.println(indeks);
            System.out.println(cas);
        }
    }
}