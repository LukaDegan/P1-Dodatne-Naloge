import java.util.*;

public class NajblizjiElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] t = new int[n];
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        int razdalja = Math.abs(k - t[0]);
        int indeks = 0;
        for(int i = 0; i < t.length; i++) {
            int trenutnaRazdalja = Math.abs(k - t[i]);
            if(trenutnaRazdalja < razdalja) {
                razdalja = trenutnaRazdalja;
                indeks = i;
            }
        }
        System.out.println(indeks);
    }
}