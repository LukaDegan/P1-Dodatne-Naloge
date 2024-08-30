import java.util.*;

public class PoliticnaNasprotja {

    /*
    sam 3 delajo in ostalo timeouta ker se mi neda resvt na bolsi nacin    
    */
    static int calls = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt(); // 0
        int d = sc.nextInt(); // 1
        int c = sc.nextInt(); // 2

        int[] tabela = new int[l+d+c];
        
        rek(tabela, tabela.length, 0, l, d, c);

        System.out.println(calls);
    }

    public static void rek(int[] tabela, int dolzina, int indeks, int l, int d, int c) {
        if(indeks >= dolzina) {
            int kolikoL = 0;
            int kolikoD = 0;
            int kolikoC = 0;

            for(int i = 0; i < tabela.length; i++) {
                if((i < tabela.length - 1) && ((tabela[i] == 0 && tabela[i+1] == 1) || (tabela[i] == 1 & tabela[i+1] == 0))) {
                    return;
                } else if(tabela[i] == 0) {
                    kolikoL++;
                } else if(tabela[i] == 1) {
                    kolikoD++;
                } else if(tabela[i] == 2) {
                    kolikoC++;
                }

                if(kolikoL > l || kolikoD > d || kolikoC > c) {
                    return;
                }
            }

            calls++;
            return;
        }

        for(int st = 0; st < 3; st++) {
            tabela[indeks] = st;
            rek(tabela, dolzina, indeks + 1, l, d, c);
        }
    }
}