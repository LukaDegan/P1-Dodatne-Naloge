import java.util.*;

public class Kombinacije {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] tabela = new int[k];
        rek(tabela, n, k, 0, 0);
    }

    public static void rek(int[] tabela, int n, int k, int indeks, int prejsnji) {
        if(indeks >= k) {
            System.out.println(Arrays.toString(tabela));
            return;
        }

        for(int i = prejsnji + 1; i <= n; i++) {
            tabela[indeks] = i;
            rek(tabela, n, k, indeks + 1, i);
        }
    }
}