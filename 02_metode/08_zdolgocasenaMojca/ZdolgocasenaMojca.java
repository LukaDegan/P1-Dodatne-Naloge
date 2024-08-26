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
                if(prime(vsota)) {
                    meci = false;
                }
            }
        }
    }
    
    public static boolean prime(int num) {
        if(num == 1) {
            return false;
        }
        boolean flag = false;
        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag) {
            return true;
        } else {
            return false;
        }
    }
}