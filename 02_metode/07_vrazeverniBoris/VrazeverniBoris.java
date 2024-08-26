import java.util.*;

public class VrazeverniBoris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        Random rand = new Random(s);

        for(int dan = 1; dan <= n; dan++) {
            int kolikokrat = 3; // trikrat more bit liho
            int stMetov = 0;
            char oznaka = 'D';

            if(dan % 7 == 0) { // ob nedeljah petkrat
                kolikokrat += 2;
                oznaka = 'N'; 
            }

            System.out.printf("%4d (%c): ", dan, oznaka);
            
            while(kolikokrat > 0) {
                int met = rand.nextInt(6) + 1; // (6) generira od 0 do 5, zato rabimo + 1
                stMetov++;
                if(met % 2 == 1) {
                    kolikokrat--;
                }
                System.out.printf("%d ", met);
            }
            
            System.out.printf("[%d]\n", stMetov);
        }        
    }
}