import java.util.*;

public class RazbijanjeStevil {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        long dolzinaM = steviloStevk(m);
        long preostaliN = n;
        
        for (long i = dolzinaM - 1; i >= 0; i--) {
            long trenutnaStevka = (m / potencaDesetke(i)) % 10;
            long potenca = potencaDesetke(trenutnaStevka);
            long delN = preostaliN / potencaDesetke(steviloStevk(preostaliN) - trenutnaStevka);
            System.out.println(delN);
            preostaliN %= potencaDesetke(steviloStevk(preostaliN) - trenutnaStevka);
        }
        
    }
    
    public static long steviloStevk(long x) {
        long stevec = 0;
        while (x > 0) {
            stevec++;
            x /= 10;
        }
        return stevec;
    }

    public static long potencaDesetke(long p) {
        long rezultat = 1;
        for (long i = 0; i < p; i++) {
            rezultat *= 10;
        }
        return rezultat;
    }
}