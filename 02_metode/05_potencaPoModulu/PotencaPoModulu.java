/*
Problem bo pri velikih stevilih
2 namiga:
    pq mod m = (p mod m)(q mod m) mod m
    kako izracunamo a^b ce poznamo a^(b/2)

ideja:
    ce je b sodo potem je a^b lahko a^(b/2) * a^(b/2) in racunamo po dani pq formuli
    ce je liho potem imamo a^(b/2) * a^(b/2) * 2 in je ubistvu p enak sodemu rezultatu, q pa je 2

*/

import java.util.*;

public class PotencaPoModulu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        
        System.out.println(f(a,b,m));       
    }

    public static long f(long a, long b, long m) {
        if(b == 0) {
            return 1;
        }

        long polovica = f(a, b / 2, m); // izracuna a^(b/2)

        long pqm = ((polovica % m) * (polovica % m)) % m; // pq mod m = (p mod m)(q mod m) mod m
                                                          // a^b mod m = (a^(b/2) mod m)(a^(b/2) mod m) mod m
        if(b % 2 != 0) { // ce je liho potem je bla polovica v resnici a^((b-1)/2) in pqm rabi se * a
            pqm = ((pqm % m) * (a % m)) % m;
        }

        return pqm;
    }
}