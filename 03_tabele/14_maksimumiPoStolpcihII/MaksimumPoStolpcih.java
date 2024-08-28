import java.util.*;

public class MaksimumPoStolpcih {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxDolzina = 0;
        int[] rezultat = new int[maxDolzina];

        for(int i = 0; i < n; i++) {
            int dolzina = sc.nextInt();

            if(dolzina > maxDolzina) {
                rezultat = raztegniTabelo(rezultat, dolzina);
                maxDolzina = dolzina;
            }

            int[] vrstica = new int[dolzina];
            
            for(int el = 0; el < vrstica.length; el++) {
                vrstica[el] = sc.nextInt();
                if(vrstica[el] > rezultat[el] || rezultat[el] == 0) {
                    rezultat[el] = vrstica[el];
                }
            }
        }

        System.out.println(Arrays.toString(rezultat));
    }

    public static int[] raztegniTabelo(int[] stara, int novaDolzina) {
        int[] nova = new int[novaDolzina];

        for(int i = 0; i < stara.length; i++) {
            nova[i] = stara[i];
        }

        return nova;
    }
}