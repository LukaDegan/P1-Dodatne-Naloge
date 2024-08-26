/*
izpisujemo vzorec brez zadnjega stolpca zvezdic
v prvi vrstici se izpise zvezdica in 0 presledkov (2^0 - 1)
v drugi zvezdica in en presledek (2^1 - 1)
v tretji zvezdica in 3 presledki (2^2 - 1)
v cetrti zvezdica in 7 presledkov (2^3 - 1)
v peti zvezdica in 15 presledkov (2^4 - 1)
*/

import java.util.*;

public class AnzetoveLedeneSvece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                                 // 5
        int dolzina = (int) Math.pow(2, n-1);                 // 16
        for(int i = 0; i < n; i++) {                          
            int zvezdice = (int) Math.pow(2, n - i - 1);      // 16 -> 8 -> 4 -> 2 -> 1
            int presledki = dolzina/zvezdice - 1;             // -1 -> 1 -> 3 -> 7 -> 15
            for(int j = 1; j <= zvezdice; j++) {        
                System.out.print("*");
                for(int k = 1; k <= presledki; k++) {          
                    System.out.print(" ");
                }
            }
            System.out.println("*"); // desni stolpec zvezdic
        }
    }
}