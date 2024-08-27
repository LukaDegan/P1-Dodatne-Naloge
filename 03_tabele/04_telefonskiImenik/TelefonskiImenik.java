import java.util.*;

public class TelefonskiImenik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[][] tabela = new String[n][2];

        for(int i = 0; i < tabela.length; i++) {
            tabela[i][0] = sc.next();
            tabela[i][1] = sc.next();
        }

        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            String ime = sc.next();
            String stevilka = "NEZNANA";
            for(int j = 0; j < tabela.length; j++) {
                if(ime.equals(tabela[j][0])) {
                    stevilka = tabela[j][1];
                }
            }
            System.out.println(stevilka);
        }
    }
}