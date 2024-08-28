import java.util.*; 

public class IzstopajociElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tabela = new int[n];
        for(int i = 0; i < tabela.length; i++) {
            tabela[i] = sc.nextInt();
        }
        boolean izstopa = false;
        
        for(int i = 0; i < tabela.length; i++) {
            int[] brezTrenutnegaElementa = new int[n];
            for(int j = 0; j < tabela.length; j++) {
                if(tabela[j] != tabela[i]) {
                    brezTrenutnegaElementa[j] = tabela[j];
                }
            }
            int gcd = gcdTabele(brezTrenutnegaElementa); // gcd elementov tabele brez i-tega elementa
            if(tabela[i] % gcd != 0) { // füerstov pogoj kdaj element izstopa
                System.out.println(tabela[i]);
                izstopa = true;
            }
        }
        if(!izstopa) {
            System.out.println("NIC");
        }
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int gcdTabele(int[] tabela) {
        int gcd = 0; 
        for(int i = 0; i < tabela.length; i++) {
            gcd = gcd(tabela[i], gcd);
        }
        return gcd;
    }
}