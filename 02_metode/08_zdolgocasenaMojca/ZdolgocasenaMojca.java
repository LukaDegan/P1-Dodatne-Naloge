import java.util.*;

public class ZdolgocasenaMojca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();

        Random rand = new Random(s);

        for(int dan = 1; dan <= d; dan++) {
            boolean meci = true;
            System.out.printf("%d. dan:\n", dan);
            int stMetov = 0;
            while(meci) {
                stMetov++;
                System.out.printf("    %d. met: ", stMetov);
                int vsota = 0;
                for(int i = 1; i <= k; i++) {
                    int met = rand.nextInt(6) + 1;
                    vsota += met;
                    System.out.printf("%d ",met);
                }
                System.out.printf("| vsota = %d\n", vsota);
                if(jePrastevilo(vsota)) {
                    meci = false;
                }
            }
        }
    }
    
    public static boolean jePrastevilo(int st) {
        if(st == 1) {
            return false;
        }
        boolean jeOK = true;
        for(int i = 2; i <= st/2; i++) {
            if(st % i == 0) {
                jeOK = false;
                break;
            }
        }
        return jeOK;
    }
}