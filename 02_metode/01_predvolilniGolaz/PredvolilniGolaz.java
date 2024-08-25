import java.util.*;

public class PredvolilniGolaz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int denar = sc.nextInt();

        while(sc.hasNextInt() && denar > 0) {
            int cena = sc.nextInt();
            int stevilo = sc.nextInt();
            int vino = sc.nextInt();

            int cenaKosila = f(cena, stevilo, vino);
            denar -= cenaKosila;
            if(denar >= 0) {
                System.out.printf("%d %d\n", cenaKosila, denar);
            } else {
                System.out.printf("%d -\n", cenaKosila);
            }
        }
    }

    public static int f(int cena, int stevilo, int vino) {
    int rezultat = cena * stevilo;
    if(vino == 1) {
        rezultat = (int) Math.round(rezultat * 1.5);
    }
    return rezultat;
}
}

