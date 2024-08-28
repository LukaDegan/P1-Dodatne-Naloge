import java.util.*;

public class PravilniTrikotniki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();

        int[][] t = new int[n][2];

        for(int i = 0; i < n; i++) {
            t[i][0] = sc.nextInt();
            t[i][1] = sc.nextInt();
        }

        double kratnik = Math.pow(10,-d);
        boolean obstaja = false;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {

                    double najdaljsa = Math.max( razdalja(i, j, t), Math.max( razdalja(i,k,t),razdalja(j,k,t) ) );
                    double najkrajsa = Math.min( razdalja(i, j, t), Math.min( razdalja(i,k,t),razdalja(j,k,t) ) );

                    double razlika = najdaljsa - najkrajsa;

                    if(razlika <  kratnik * najkrajsa) {
                        obstaja = true;
                        System.out.printf("%d %d %d\n",i,j,k);
                    }
                }
            }
        }

        if(!obstaja) {
            System.out.println("BREZ");
        }
    }

    public static double razdalja(int T1, int T2, int[][] tabela) {
        // sqrt( (x2 - x1)^2 + (y2 - y1)^2 )
        double dolzina = Math.sqrt(Math.pow((tabela[T2][0] - tabela[T1][0]),2) + Math.pow((tabela[T2][1] - tabela[T1][1]),2));
    
        return dolzina;
    }
}