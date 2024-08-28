import java.util.*;

public class Izstevanka {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stOtrok = sc.nextInt();
        int stBesed = sc.nextInt();

        String[] otroci = new String[stOtrok];
        for(int i = 0; i < otroci.length; i++) {
            otroci[i] = sc.next();
        }

        int vIgri = stOtrok;

        for(int krog = 1; krog < stOtrok; krog++) {
            int indeksVen = (stBesed - 1)  % vIgri;
            System.out.println(otroci[indeksVen]);

            for(int i = indeksVen; i < (stOtrok - 1) ; i++) {
                otroci[i] = otroci[i + 1];
            }
            vIgri--;
        }
    }
}