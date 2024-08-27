import java.util.*;

public class PascalovTrikotnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] tabela = new int[n+1][n+1];

        for(int i = 0; i < tabela.length; i++) {
            for(int j = 0; j <= i; j++) {

                tabela[i][j] = (j == 0) ? 1 : tabela[i-1][j-1] + tabela[i-1][j];
                
                if(i == j) {
                    System.out.printf("%d\n",tabela[i][j]);
                } else {
                    System.out.printf("%d ",tabela[i][j]);
                }
            }
        }
    }
}