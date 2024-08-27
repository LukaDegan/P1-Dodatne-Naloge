import java.util.*;

public class ZlataSredina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int[] tabela = new int[2*k+1];
        for(int i = 0; i< tabela.length; i++) {
            tabela[i] = sc.nextInt();
        }

        Arrays.sort(tabela); // sortera od najmanjsega do najvecjega elementa

        System.out.println(tabela[k]); // iscemo sredino, torej k
    }
}