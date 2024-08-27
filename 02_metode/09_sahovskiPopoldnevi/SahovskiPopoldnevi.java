import java.util.*;

public class SahovskiPopoldnevi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        int s = sc.nextInt();
        int verjetnostA = sc.nextInt();
        int verjetnostB = sc.nextInt();
        int verjetnostRemi = 100 - verjetnostA - verjetnostB;
        int maxPartij = sc.nextInt();
        int stZmag = sc.nextInt();
        int stDni = sc.nextInt();
        
        Random rand = new Random(s);
       
        for(int i = 1; i <= stDni; i++) {
            System.out.printf("%d. dan: ", i);
            int zmageAndrej = 0;
            int zmageBranko = 0;
            int j = 0;
            while(j < maxPartij && zmageAndrej < stZmag && zmageBranko < stZmag) {
                int izid = rand.nextInt(100);
                if(izid < verjetnostA) {
                    zmageAndrej++;
                    System.out.print("A");
                } else if(verjetnostA <= izid && izid < verjetnostA + verjetnostB) {
                    zmageBranko++;
                    System.out.print("B");
                } else {
                    System.out.print("r");
                }
                j++;
            }
            System.out.printf(" (%d)\n",j);
        }
    }
}