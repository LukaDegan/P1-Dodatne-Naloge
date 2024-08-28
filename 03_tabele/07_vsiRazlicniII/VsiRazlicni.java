import java.util.*;

public class VsiRazlicni {
    
    private static final int MAKS_STEVILO = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*

        50/50 da test10 timeouta

        */

        int s = sc.nextInt();
        int n = sc.nextInt();

        Random random = new Random(s);

        int[] t = new int[n];

        for(int i = 0; i< t.length; i++) {
            t[i] = random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;
        }
        Arrays.sort(t);

        boolean razlicni = true;
        int iskanoZdaj = t[0];
        int pojavitveZdaj = 1;

        int iskanoPrej = 0;
        int pojavitvePrej = 0;

        for(int i = 1; i < t.length; i++) {
            if(t[i] == iskanoZdaj) {
                razlicni = false;
                pojavitveZdaj++;
            } else {
                if(pojavitveZdaj > pojavitvePrej) {
                    iskanoPrej = iskanoZdaj;
                    pojavitvePrej = pojavitveZdaj;
                }
                iskanoZdaj = t[i];
                pojavitveZdaj = 1;
            }
        }

        if(razlicni) {
            System.out.println("RAZLICNI");
        } else if(pojavitveZdaj > pojavitvePrej) {
            System.out.println(iskanoZdaj);
        } else {
            System.out.println(iskanoPrej);
        }   
    }
}